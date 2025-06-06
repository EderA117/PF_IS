# 📚 API REST de Cómics

Bienvenido a la **API REST de Cómics**, un proyecto desarrollado con **Spring Boot** que permite gestionar una colección de cómics mediante operaciones CRUD completas. Ideal para tiendas, coleccionistas o desarrolladores que deseen consumir datos de cómics de forma sencilla.

---

## 🚀 Tecnologías utilizadas

- ☕ Java 17
- 🌱 Spring Boot 3
- 🧠 Spring Data JPA
- 🐘 PostgreSQL (o cualquier motor compatible con JPA/Hibernate)
- 🔀 API RESTful
- 🧪 Postman (para pruebas)
- 🐳 Docker 

---

## 🧩 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com.example.comics/
│   │       ├── controller/
│   │       │   └── ComicRestController.java
│   │       ├── dto/
│   │       │   └── ComicUpdateDto.java
│   │       ├── model/
│   │       │   └── Comic.java
│   │       ├── repository/
│   │       │   └── ComicRepository.java
│   │       ├── service/
│   │       │   └── ComicService.java
│   │       └── ComicApiApplication.java
│   └── resources/
│       └── application.properties
```

---

## 🧪 Endpoints disponibles

| Método | Endpoint                   | Descripción                  |
|--------|----------------------------|------------------------------|
| GET    | `/api/v1/comics/`         | Obtener todos los cómics     |
| GET    | `/api/v1/comics/{id}`     | Obtener un cómic por ID      |
| POST   | `/api/v1/comics/`         | Crear un nuevo cómic         |
| PUT    | `/api/v1/comics/{id}`     | Actualizar un cómic completo |
| PATCH  | `/api/v1/comics/{id}`     | Actualización parcial        |
| DELETE | `/api/v1/comics/{id}`     | Eliminar un cómic por ID     |

---

## 📦 Formato JSON esperado

```json
{
  "titulo": "Batman: Año Uno",
  "editorial": "DC Comics",
  "numeroEdicion": "001",
  "precio": 99.99,
  "imagen": "https://upload.wikimedia.org/wikipedia/en/thumb/4/4f/Batman_404.png/220px-Batman_404.png"
}
```

---

## 🔧 Cómo probar con Postman

1. Selecciona el método adecuado (`GET`, `POST`, `PUT`, etc.).
2. Usa la URL `http://localhost:8081/api/v1/comics/`.
3. Para `POST`, `PUT` o `PATCH`, ve a **Body > raw > JSON**.
4. Añade el header:
   ```
   Content-Type: application/json
   ```

---

## 💥 Ejemplos de cómics para pruebas

```json
[
  {
    "titulo": "Spider-Man: Azul",
    "editorial": "Marvel Comics",
    "numeroEdicion": "010",
    "precio": 110.00,
    "imagen": "https://upload.wikimedia.org/wikipedia/en/f/f3/Spider-Man_Blue_1.jpg"
  },
  {
    "titulo": "Watchmen",
    "editorial": "DC Comics",
    "numeroEdicion": "001",
    "precio": 150.00,
    "imagen": "https://upload.wikimedia.org/wikipedia/en/a/a2/Watchmen-cover.png"
  },
  {
    "titulo": "Invincible Vol.1",
    "editorial": "Image Comics",
    "numeroEdicion": "001",
    "precio": 130.50,
    "imagen": "https://upload.wikimedia.org/wikipedia/en/9/9f/Invincible_%28comic_book%29_vol_1.png"
  },
  {
    "titulo": "Saga Vol. 1",
    "editorial": "Image Comics",
    "numeroEdicion": "001",
    "precio": 120.00,
    "imagen": "https://upload.wikimedia.org/wikipedia/en/b/b4/Saga1coverByFionaStaples.jpg"
  },
  {
    "titulo": "The Sandman Vol. 1",
    "editorial": "Vertigo",
    "numeroEdicion": "001",
    "precio": 160.00,
    "imagen": "https://upload.wikimedia.org/wikipedia/en/e/e3/Sandman1.jpg"
  }
]
```

---

## 🛡️ Validaciones y configuración de la entidad

En `Comic.java`, cada campo tiene restricciones útiles como:

```java
@Column(name = "titulo_comic", nullable = false, length = 150)
private String titulo;

@Column(name = "imagen_url", columnDefinition = "VARCHAR(350) DEFAULT 'https://png.pngtree.com/...'", nullable = true)
private String imagen;
```

Además, se maneja correctamente `@RequestBody` en los controladores para evitar errores 415 (Unsupported Media Type). Asegúrate de usar `Content-Type: application/json` en todas las peticiones POST, PUT y PATCH.

---

## 🐳 Ejecución con Docker (opcional)

Puedes crear una imagen y ejecutarla:

```bash
# Crear el .jar
./mvnw clean package

# Crear imagen Docker
docker build -t comic-api .

# Ejecutar
docker run -p 8080:8080 comic-api
```

---

## 🧠 Autor

Alvarez Macias Eder

---



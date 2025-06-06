package mx.una.aragon.is.comicsapi.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "comics")
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clave;

    @Column(name = "titulo_comic", nullable = false, length = 150)
    private String titulo;

    @Column(name = "editorial_comic", nullable = false, length = 150)
    private String editorial;

    @Column(name = "numero_comic", columnDefinition = "VARCHAR(10) not null")
    private String numeroEdicion;

    @Column(name = "precio_pesos", nullable = true)
    private Float precio;

    @Column(name = "imagen_url", length = 255, nullable = true,  insertable = true, columnDefinition = "VARCHAR(350) DEFAULT 'https://png.pngtree.com/png-vector/20230407/ourmid/pngtree-placeholder-line-icon-vector-png-image_6691835.png'")
    private String imagen;

    public Comic() {
    }

    public Comic(Integer clave, String titulo, String editorial, String numeroEdicion, Float precio, String imagen) {
        this.clave = clave;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comic comic = (Comic) o;
        return clave == comic.clave && Objects.equals(titulo, comic.titulo) && Objects.equals(editorial, comic.editorial) && Objects.equals(numeroEdicion, comic.numeroEdicion) && Objects.equals(precio, comic.precio) && Objects.equals(imagen, comic.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, titulo, editorial, numeroEdicion, precio, imagen);
    }

    @Override
    public String toString() {
        return "Comic{" +
                "clave=" + clave +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numeroEdicion='" + numeroEdicion + '\'' +
                ", precio=" + precio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}

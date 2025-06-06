package mx.una.aragon.is.comicsapi.dtos;

import java.util.Objects;

public class ComicUpdateDto {
    private String titulo;
    private String editorial;
    private String numEdicion;
    private Float precio;
    private String imagen;

    public ComicUpdateDto() {
    }

    public ComicUpdateDto(String titulo, String editorial, String numEdicion, Float precio, String imagen) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.numEdicion = numEdicion;
        this.precio = precio;
        this.imagen = imagen;
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

    public String getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
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
        ComicUpdateDto that = (ComicUpdateDto) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(editorial, that.editorial) && Objects.equals(numEdicion, that.numEdicion) && Objects.equals(precio, that.precio) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, editorial, numEdicion, precio, imagen);
    }

    @Override
    public String toString() {
        return "ComicUpdateDto{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numEdicion='" + numEdicion + '\'' +
                ", precio=" + precio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}

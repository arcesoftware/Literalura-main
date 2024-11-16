package com.alura.literalura.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private   String nombre;
    private   int fechaNacimiento;
    private   int fechaMuerte;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
    private List<Libro> libros;


    public Autor() {
    }


    public Autor(DatosAutor datosAutor)  {
        this.nombre = datosAutor.nombre() ;
        this.fechaNacimiento = Integer.parseInt(datosAutor.FechaNacimiento());
        this.fechaMuerte = Integer.parseInt(datosAutor.FechaMuerte());
    }


    @Override
    public String toString() {
        return  "******************************************************************************" + "\n" +
                "   Nombre:  " + nombre  +   "\n" +
                "   Fecha nacimiento:  " + fechaNacimiento + "\n" +
                "   Fecha muerte:  " + fechaMuerte +  "\n" +
                "*******************************************************************************";

    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(int fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
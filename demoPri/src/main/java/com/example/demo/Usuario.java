package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String correo;

    @Column
    private String contrasena;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String edad;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCorreo() {return correo;}

    public void setCorreo(String correo) {this.correo = correo;}

    public String getContrasena() {return contrasena;}

    public void setContrasena(String contrasena) {this.contrasena = contrasena;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getEdad() {return edad;}

    public void setEdad(String edad) {
        this.edad = edad;
    }
}

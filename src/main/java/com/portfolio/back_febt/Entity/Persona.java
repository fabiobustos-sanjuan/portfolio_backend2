package com.portfolio.back_febt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*private Long id;*/
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgs;
    
     @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String imgl;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String direccion;
    
    @NotNull
    @Size(min = 1, max = 250, message = "no cumple con la longitud")
    private String profesion;
    
    @NotNull
    @Size(min = 1, max = 255, message = "no cumple con la longitud")
    private String about;

   //Código Nuevo

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String imgs, String imgl, String direccion, String profesion, String about) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imgs = imgs;
        this.imgl = imgl;
        this.direccion = direccion;
        this.profesion = profesion;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getImgl() {
        return imgl;
    }

    public void setImgl(String imgl) {
        this.imgl = imgl;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.back_febt.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author febt2
 */
public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String email;
    @NotBlank
    private String imgs;
    @NotBlank
    private String imgl;
    @NotBlank
    private String direccion;
    @NotBlank
    private String profesion;
    @NotBlank
    private String about;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String email, String imgs, String imgl, String direccion, String profesion, String about) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imgs = imgs;
        this.imgl = imgl;
        this.direccion = direccion;
        this.profesion = profesion;
        this.about = about;
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

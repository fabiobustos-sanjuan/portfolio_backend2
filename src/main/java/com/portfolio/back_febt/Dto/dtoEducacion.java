package com.portfolio.back_febt.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoEducacion {
    @NotBlank
    private String nombreEsc;
    @NotBlank
    private String area;
    @NotBlank
    private String titulo;
    @NotBlank
    private String img;
    @NotBlank
    private String inicio;
    @NotBlank
    private String fin;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEsc, String area, String titulo, String img, String inicio, String fin) {
        this.nombreEsc = nombreEsc;
        this.area = area;
        this.titulo = titulo;
        this.img = img;
        this.inicio = inicio;
        this.fin = fin;
    }
}

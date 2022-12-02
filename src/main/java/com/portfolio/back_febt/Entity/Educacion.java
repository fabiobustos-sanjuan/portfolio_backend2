package com.portfolio.back_febt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;    
    private String nombreEsc;
    private String area;
    private String titulo;
    private String img;
    private String inicio;
    private String fin;
    
    public Educacion(){        
    }
    
    public Educacion(String nombreEsc, String area, String titulo, String img, String inicio, String fin){
        this.nombreEsc = nombreEsc;
        this.area = area;
        this.titulo = titulo;
        this.img = img;
        this.inicio = inicio;
        this.fin = fin;
    }
}

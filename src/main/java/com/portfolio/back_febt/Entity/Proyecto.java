package com.portfolio.back_febt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombreP;
    private String descP;
    private String imgP;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descP, String imgP) {
        this.nombreP = nombreP;
        this.descP = descP;
        this.imgP = imgP;
    }
}

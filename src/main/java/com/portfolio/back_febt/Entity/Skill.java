package com.portfolio.back_febt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombreS;
    private String tipoS;
    //private String porcS;
    private int porcS;

    public Skill() {
    }

    public Skill(String nombreS, String tipoS, int porcS) {
        this.nombreS = nombreS;
        this.tipoS = tipoS;
        this.porcS = porcS;
    }
    
}

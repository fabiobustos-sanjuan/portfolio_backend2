package com.portfolio.back_febt.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoSkill {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String tipoS;
    @NotBlank
    private Integer porcS;

    public dtoSkill() {
    }

    public dtoSkill(String nombreS, String tipoS, Integer porcS) {
        this.nombreS = nombreS;
        this.tipoS = tipoS;
        this.porcS = porcS;
    }        
}

package com.portfolio.back_febt.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descP;
    @NotBlank
    private String imgP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descP, String imgP) {
        this.nombreP = nombreP;
        this.descP = descP;
        this.imgP = imgP;
    }
    
    
    
}

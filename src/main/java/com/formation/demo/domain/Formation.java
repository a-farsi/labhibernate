package com.formation.demo.domain;

import lombok.*;

@Getter
@Setter
public class Formation {
    private Long id;
    private String theme;

    public Formation(String theme){
        this.theme = theme;
    }
}
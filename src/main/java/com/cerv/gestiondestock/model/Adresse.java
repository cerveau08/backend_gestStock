package com.cerv.gestiondestock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse extends AbstractEntity{

    @Column(name = "adresse1")
    private  String adresse1;

    @Column(name = "adresse2")
    private  String adresse2;

    @Column(name = "ville")
    private  String ville;

    @Column(name = "codePostale")
    private  String codePostale;

    @Column(name = "pays")
    private  String pays;
}

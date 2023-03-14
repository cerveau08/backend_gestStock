package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.LigneCommandeFournisseurDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public  static List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        List<String> errors = new ArrayList<>();
        if (ligneCommandeFournisseurDto == null) {
            errors.add("Veuillez renseigner la quantité");
            errors.add("Veuillez renseigner le prix unitaire");
            return errors;
        }
        if (ligneCommandeFournisseurDto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantité");
        }
        if (ligneCommandeFournisseurDto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire");
        }
        return errors;
    }
}

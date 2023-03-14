package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.LigneCommandeClientDto;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {
    public  static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto) {
        List<String> errors = new ArrayList<>();
        if (ligneCommandeClientDto == null) {
            errors.add("Veuillez renseigner la quantité");
            errors.add("Veuillez renseigner le prix unitaire");
            return errors;
        }
        if (ligneCommandeClientDto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantité");
        }
        if (ligneCommandeClientDto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire");
        }
        return  errors;
    }
}

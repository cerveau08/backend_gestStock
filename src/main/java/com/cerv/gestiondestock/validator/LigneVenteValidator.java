package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.LigneVenteDto;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public  static List<String> validate(LigneVenteDto ligneVenteDto) {
        List<String> errors = new ArrayList<>();
        if (ligneVenteDto == null) {
            errors.add("Veuillez renseigner la quantité");
            errors.add("Veuillez renseigner le prix unitaire");
            return errors;
        }
        if (ligneVenteDto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantité");
        }
        if (ligneVenteDto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire");
        }
        return errors;
    }
}

package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public static List<String> validate(EntrepriseDto entrepriseDto) {
        List<String> errors = new ArrayList<>();
        if (entrepriseDto == null) {
            errors.add("veuiller renseigner le nom de l'entreprise");
            errors.add("veuiller renseigner la description de l'entreprise");
            errors.add("veuiller renseigner l'adresse de l'entreprise");
            errors.add("veuiller renseigner le mail de l'entreprise ");
            errors.add("veuiller selectionner une photo pour  l'entreprise");
            return errors;
        }
        if (!StringUtils.hasLength(entrepriseDto.getNom())) {
            errors.add("veuiller renseigner le nom de l'entreprise");
        }
        if (!StringUtils.hasLength(entrepriseDto.getDescription())) {
            errors.add("veuiller renseigner la description de l'entreprise");
        }
        if (entrepriseDto.getAdresse() == null) {
            errors.add("veuiller renseigner l'adresse de l'entreprise");
        } else {
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getAdresse1())) {
                errors.add("Le champ 'Adresse 1' est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getAdresse2())) {
                errors.add("Le champ 'Adresse 2' est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getVille())) {
                errors.add("le champ ville est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getPays())) {
                errors.add("le champ pays est obligatoire");
            }
        }
        if (!StringUtils.hasLength(entrepriseDto.getEmail())) {
            errors.add("veuiller renseigner le mail de l'entreprise");
        }
        if (entrepriseDto.getNom() == null) {
            errors.add("veuiller selectionner une photo pour de l'entreprise");
        }
        return errors;
    }
}

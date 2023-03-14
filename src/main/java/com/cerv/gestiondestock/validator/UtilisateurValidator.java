package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();
        if (utilisateurDto == null) {
            errors.add("veuiller renseigner le nom de l'utilisateur");
            errors.add("veuiller renseigner le prénom de l'utilisateur");
            errors.add("veuiller renseigner l'email de l'utilisateur");
            errors.add("veuiller renseigner la date de naissance  de l'utilisateur");
            errors.add("veuiller renseigner l'adresse de l'utilisateur");
            errors.add("veuiller renseigner le mot de passe de l'utilisateur");
            errors.add("veuiller selectionner une  photo ");
            return errors;
        }
        if(!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez renseigner le nom de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("Veuillez renseigner l'email de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez renseigner le prenom de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }
        if (utilisateurDto.getDateDeNaissance()==null){
            errors.add("veuiller renseigner la date de naissance  de l'utilisateur");
        }
        if (utilisateurDto.getPhoto()==null){
            errors.add("veuiller selectionner une  photo");
        }
        if(utilisateurDto.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        } else {
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())) {
                errors.add("Le champ 'Adresse 1' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse2())) {
                errors.add("Le champ 'Adresse 2' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                errors.add("Le champ 'Ville' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())) {
                errors.add("Le champ 'Code postale' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())) {
                errors.add("Le champ 'Pays' est obligatoire");
            }
        }
        return errors;
    }
}

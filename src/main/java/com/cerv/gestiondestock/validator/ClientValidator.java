package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto clientDto) {
        List<String> errors = new ArrayList<>();
        if (clientDto == null) {
            errors.add("Veuillez renseigner le nom du client");
            errors.add("Veuillez renseigner le prénom du client");
            errors.add("Veuillez renseigner le mail du client");
            errors.add("Veuillez renseigner le numéro de téléphone du client");
            errors.add("Veuillez sélectionner une photo pour le client");
            return errors;
        }
        if (!StringUtils.hasLength(clientDto.getNom())) {
            errors.add("Veuiller renseigner le nom du client");
        }
        if (!StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("veuiller renseigner le prenom du client");
        }
        if (!StringUtils.hasLength(clientDto.getMail())){
            errors.add("veuiller renseigner le mail du client");
        }
        if (!StringUtils.hasLength(clientDto.getNumTel())){
            errors.add("veuiller renseigner le numero telephone du client");
        }
        if (clientDto.getNom()==null){
            errors.add("veuiller selectionner une photo pour le client");
        }
        if (clientDto.getAdresse()== null){
            errors.add("veuiller renseigner l'adresse du client");
        } else {
            if (!StringUtils.hasLength(clientDto.getAdresse().getAdresse1())){
                errors.add("le champ adresse 1 est obligatoire");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getAdresse2())){
                errors.add("le champ adresse 2 est obligatoire");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getVille())){
                errors.add("le champ ville est obligatoire");
            }
            if (!StringUtils.hasLength(clientDto.getAdresse().getPays())){
                errors.add("le champ pays est obligatoire");
            }
        }
        return errors;
    }
}

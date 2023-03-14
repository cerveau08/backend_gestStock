package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public  static List<String> validate(CommandeFournisseurDto commandeFournisseurDto) {
        List<String> errors = new ArrayList<>();
        if (commandeFournisseurDto == null) {
            errors.add("Veuillez renseigner le code de la vente");
            return errors;
        }
        if (!StringUtils.hasLength(commandeFournisseurDto.getCode())) {
            errors.add("Veuillez renseigner le code de la vente");
        }
        return errors;
    }
}

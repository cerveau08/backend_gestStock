package com.cerv.gestiondestock.validator;

import com.cerv.gestiondestock.dto.MvStkDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MvStkValidator {
    public  static List<String> validate(MvStkDto mvStkDto) {
        List<String> errors = new ArrayList<>();
        if (mvStkDto == null) {
            errors.add("Veuillez renseigner la quantité");
            return errors;
        }
        if (mvStkDto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantité");
        }
        return errors;
    }
}

package com.cerv.gestiondestock.dto;

import com.cerv.gestiondestock.model.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    @JsonIgnore
    private List<UtilisateurDto> utilistaeurs;

    public static RolesDto fromEntity(Roles roles) {
        if (roles == null) {
            return  null;
        }
        return RolesDto.builder()
                .roleName(roles.getRoleName())
                .build();
    }

    public static Roles toEntity(RolesDto rolesDto) {
        if (rolesDto == null) {
            return null;
        }
        Roles roles = new Roles();
        roles.setRoleName(rolesDto.getRoleName());
        return roles;
    }
}

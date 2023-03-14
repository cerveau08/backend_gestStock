package com.cerv.gestiondestock.dto;

import com.cerv.gestiondestock.model.LigneVente;
import com.cerv.gestiondestock.model.MvStk;
import com.cerv.gestiondestock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvStkDto {

    private Integer id;

    private ArticleDto article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    public static MvStkDto fromEntity(MvStk mvStk) {
        if (mvStk == null) {
            return null;
        }
        return MvStkDto.builder()
                .id(mvStk.getId())
                .quantite(mvStk.getQuantite())
                .dateMvt(mvStk.getDateMvt())
                .typeMvt(mvStk.getTypeMvt())
                .article(ArticleDto.fromEntity(mvStk.getArticle()))
                .build();
    }

    public static MvStk toEntity(MvStkDto mvStkDto) {
        if (mvStkDto == null) {
            return null;
        }
        MvStk mvStk = new MvStk();
        mvStk.setQuantite(mvStkDto.getQuantite());
        mvStk.setDateMvt(mvStkDto.getDateMvt());
        mvStk.setTypeMvt(mvStkDto.getTypeMvt());
        mvStk.setArticle(ArticleDto.toEntity(mvStkDto.getArticle()));
        return mvStk;
    }
}

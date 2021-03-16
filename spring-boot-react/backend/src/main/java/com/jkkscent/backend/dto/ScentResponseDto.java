package com.jkkscent.backend.dto;

import com.jkkscent.backend.domain.Scent;
import lombok.Getter;

@Getter
public class ScentResponseDto {

    private Long id;
    private String name;
    private Long price;
    private String thumbnailFilename;
    private String regDt;
    private String categories;
    private String detail;

    public ScentResponseDto(Scent entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.thumbnailFilename = entity.getThumbnailFilename();
        this.regDt = entity.getRegDt();
        this.categories = entity.getCategories();
        this.detail = entity.getDetail();
    }

}

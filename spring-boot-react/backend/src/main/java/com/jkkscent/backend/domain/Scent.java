package com.jkkscent.backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Scent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="scent_id")
    private Long id;

    private String name;
    private Long price;
    private String thumbnailFilename;
    private String regDt;
    private String categories;
    private String detail;

    @Builder
    public Scent(String name, Long price, String thumbnailFilename, String regDt, String categories, String detail) {
        this.name = name;
        this.price = price;
        this.thumbnailFilename = thumbnailFilename;
        this.regDt = regDt;
        this.categories = categories;
        this.detail = detail;
    }

}

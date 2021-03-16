package com.jkkscent.backend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Scent {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="scent_id")
    private Long id;

    private String name;
    private Long price;
    private String thumbnailFilename;
    private String regDt;
    private String categories;
    private String detail;

}

package com.adhunter.model;

import com.adhunter.model.enums.Category;
import com.adhunter.model.enums.Region;
import com.adhunter.model.enums.Type;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AdDescription {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Region region;
    @Column(length = 5000)
    private String description;
    private String origin;
    private String citySale;

    public AdDescription(Category category, Type type, Region region, String description, String origin, String citySale) {
        this.category = category;
        this.type = type;
        this.region = region;
        this.description = description;
        this.origin = origin;
        this.citySale = citySale;
    }
}

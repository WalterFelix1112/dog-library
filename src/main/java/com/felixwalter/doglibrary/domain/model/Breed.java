package com.felixwalter.doglibrary.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@NonNull
@Accessors(chain = true)
public class Breed {
    private String breedName;
    private String origin;
    private String countryCode;
    private String description;
    private String temperament;
    private String lifeSpan;
}

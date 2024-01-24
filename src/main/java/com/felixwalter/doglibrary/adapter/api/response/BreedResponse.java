package com.felixwalter.doglibrary.adapter.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BreedResponse {
    private String breedName;
    private String origin;
    private String countryCode;
    private String description;
    private String temperament;
    private String lifeSpan;
}

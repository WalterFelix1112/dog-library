package com.felixwalter.doglibrary.adapter.api.response;

import lombok.*;

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

package com.felixwalter.doglibrary.adapter.api;

import com.felixwalter.doglibrary.adapter.api.response.BreedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DogBreedController {

    @GetMapping("/breed")
    public ResponseEntity<BreedResponse> getBreed() {
        BreedResponse breedResponse = BreedResponse.builder()
                .breedName("Australian Shepherd")
                .countryCode("AU")
                .description("Intelligent and active breed.")
                .lifeSpan("12 years")
                .origin("Australia")
                .temperament("Strong character")
                .build();

        return new ResponseEntity<>(
                breedResponse,
                HttpStatus.OK
        );
    }
}
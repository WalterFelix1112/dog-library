package com.felixwalter.doglibrary.adapter.api;

import com.felixwalter.doglibrary.adapter.api.response.BreedResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Dog Breed")
public class DogBreedController {

    @Operation(
            description = "Get information of a dog breed",
            summary = "This is a summary for the get dog breed endpoint",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping("/breed")
    public ResponseEntity<BreedResponse> getBreed() {
        BreedResponse breedResponse = BreedResponse.builder()
                .breedName("Australian Shepherd")
                .countryCode("AU")
                .description("Intelligent and active dog.")
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
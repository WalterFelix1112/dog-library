package com.felixwalter.doglibrary.adapter.api;

import com.felixwalter.doglibrary.adapter.api.response.BreedResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DogBreedControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getBreed() {
        ResponseEntity<BreedResponse> response = restTemplate.getForEntity("/api/v1/breed", BreedResponse.class);

        BreedResponse breedResponse = response.getBody();

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("Australian Shepherd", breedResponse.getBreedName());
    }
}
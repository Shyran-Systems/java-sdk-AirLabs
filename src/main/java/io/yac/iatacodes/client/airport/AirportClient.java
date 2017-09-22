package io.yac.iatacodes.client.airport;

import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.jackson.JacksonDecoder;
import io.yac.iatacodes.client.ApiConstants;
import io.yac.iatacodes.client.airport.internal.AirportResponseJSON;

public class AirportClient {

    private final String apiKey;

    public AirportClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public AirportResponseJSON get(AirportRequest request) {
        return Feign.builder().decoder(new JacksonDecoder()).target(Airport.class, ApiConstants.ENDPOINT)
                .get(apiKey, request.getIataCode());
    }

    public AirportResponseJSON get(String airportIataCode) {
        return get(AirportRequest.builder().iataCode(airportIataCode).build());
    }

    interface Airport {

        @RequestLine("GET /airports?api_key={key}&code={code}")
        AirportResponseJSON get(@Param("key") String apiKey, @Param("code") String iataCode);
    }
}

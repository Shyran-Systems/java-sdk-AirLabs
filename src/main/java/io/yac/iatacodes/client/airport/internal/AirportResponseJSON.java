package io.yac.iatacodes.client.airport.internal;

import io.yac.iatacodes.client.airport.Airport;

import java.util.List;

public class AirportResponseJSON {

    private List<Response> response;

    {

    }

    public AirportResponseJSON() {
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public Airport asAirport() {
        Response response = this.response.get(0);
        return Airport.builder().iataCode(response.getCode()).name(response.getName()).build();
    }

    static class Response {
        private String code;

        private String name;

        public Response() {
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

package io.yac.iatacodes.client.airport;

public class AirportRequest {

    private final String iataCode;


    public AirportRequest(String iataCode) {
        this.iataCode = iataCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getIataCode() {
        return iataCode;
    }

    public static class Builder {
        private String iataCode;

        public Builder iataCode(String iataCode) {
            this.iataCode = iataCode;
            return this;
        }

        public AirportRequest build() {
            return new AirportRequest(iataCode);
        }
    }
}

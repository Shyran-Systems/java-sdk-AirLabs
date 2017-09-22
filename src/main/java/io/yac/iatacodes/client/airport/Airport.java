package io.yac.iatacodes.client.airport;

public class Airport {

    private final String iataCode;

    private final String name;

    public Airport(String iataCode, String name) {
        this.iataCode = iataCode;
        this.name = name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getName() {
        return name;
    }


    public static class Builder {
        private String iataCode;
        private String name;

        public Builder iataCode(String iataCode) {
            this.iataCode = iataCode;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Airport build() {
            return new Airport(iataCode, name
            );
        }
    }
}

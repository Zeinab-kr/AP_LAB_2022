public class Address {
    private String zipCode;
    private String country;
    private String city;

    // constructor
    public Address(String zipCode, String country, String city) {
        this.city = ((city.equals("-")) ? null : city);
        this.country = ((country.equals("")) ? null : country);
        this.zipCode = ((zipCode.equals("")) ? null : zipCode);
    }

    @Override
    public String toString() {
        return "Email: " + ((zipCode == null) ? "no email!" : zipCode) + "\n"
                + "Country: " + ((country == null) ? "no country!" : country) + "\n"
                + "City: " + ((city == null) ? "no city!" : city) + "\n";
    }

    // setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // getters
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }
}

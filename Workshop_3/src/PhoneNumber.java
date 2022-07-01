public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        if (number.length() != 12) {
            System.out.println("Invalid phone number!");
            return;
        }
        this.number = number;
    }

    public String toString() {
        return countryCode + number;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        if (number.length() != 12) {
            System.out.println("Invalid phone number!");
            return;
        }
        this.number = number;
    }
}

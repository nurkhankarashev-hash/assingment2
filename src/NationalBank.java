public class NationalBank extends Bank {
    private String country;

    public NationalBank(String name, String country) {
        super(name);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country: " + country;
    }
}

package oops.composition;

public class Address {
    int houseNumber;
    String street;
    String area;
    String city;
    String State;
    String Country;
    String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

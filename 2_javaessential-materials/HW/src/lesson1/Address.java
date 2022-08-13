package lesson1;

public class Address {
    int index, house, apartment;
    String country, city, street;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public Address(int index, int house, int apartment, String country, String city, String street) {
        this.index = index;
        this.house = house;
        this.apartment = apartment;
        this.country = country;
        this.city = city;
        this.street = street;


    }



    public static void main(String[] args) {
        Address address = new Address(49115,1,1,"Ukraine", "Dnepr", "Parkoviy");
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getIndex());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());
        System.out.println(address.toString());
    }

    public String toString() {
        return "Index: " + getIndex() +
                "\nCity: " + getCity() +
                "\nCountry: " + getCountry() +
                "\nStreet: " + getStreet() +
                "\nHouse: " + getHouse() +
                "\nApartment: " + getApartment();
    }

}

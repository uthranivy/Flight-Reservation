public class Passenger {
    private static int idCounter;
    private int id;
    private Address address;
    private Contact contact;

    public static int countProducts() {
        return idCounter;
    }
    static {
        idCounter = 0;
    }
    public Passenger(int idCounter, String contactName, String contactPhone,
                     String contactEmail, String addressStreet, String addressCity,
                     String addressState) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getPassengerCount(){
        return this.id;
    }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
}

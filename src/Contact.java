public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String emailAddress;
    //Create contacts with different sets of inputs. To do this implement
    //compile time polymorphism and overload our constructor


    public Contact(String name, PhoneNumber phoneNumber, String emailAddress)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name, String emilAddress)
    {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    //here we are using RUNTIME Polymorphsim to override the default object toString functionality
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

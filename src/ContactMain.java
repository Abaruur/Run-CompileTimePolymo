public class ContactMain {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Makhtal",
                new PhoneNumber(56, "3204257698"));
        Contact contactTwo = new Contact("Ali",
                new PhoneNumber(41, "4587894561"));
        Contact contactThree = new Contact("Marry",
                new PhoneNumber(63, "7894257698"));
        Contact contactFour = new Contact("John",
                new PhoneNumber(25, "9724257698"));
        Contact contactFive = new Contact("Mark",
                new PhoneNumber(55, "3924257698"));

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
    //By creating an overloaded constructor,we've reduced complexity because
    // we only have to input the values we want to initialize in the method.
        /*
        CONSOLE OUTPUT.
            ONLY GOT REFERENCES TO THE CONTACT OBJECT! We can't see the actual data.
        Contact@1b28cdfa
        Contact@eed1f14
        Contact@7229724f
        Contact@4c873330
        Contact@119d7047*/
        // If we want to see the phone number,name,and email address,
        //we need to override the two string method, in the contact class.
    }

}

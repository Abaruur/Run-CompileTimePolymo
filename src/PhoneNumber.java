public class PhoneNumber {
    private int countryCode;
    private String phoneNumber;

    public PhoneNumber(int countryCode) {
       if(phoneNumber.length()> 10)
       {
           // If there are more than 10 digits then
           //the last 10 digits, represents the phone number.
           //and whatever digits are in the beginning must be the area code
           //To grab the country code, we'll grab a sub string of the phone
           // number, starting at zero and going to the length minus 10.
           this.countryCode = Integer.parseInt(phoneNumber.
                   substring(0, phoneNumber.length() - 10));
           this.phoneNumber = phoneNumber.
                   substring(phoneNumber.length() - 10);
       }else
       {
          this.countryCode = 1;
          this.phoneNumber = phoneNumber;
       }
    }

    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

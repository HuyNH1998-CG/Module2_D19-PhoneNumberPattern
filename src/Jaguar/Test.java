package Jaguar;

public class Test {
    public static PhoneNumberRegex phoneNumberRegex;
    public static final String[] validNumber = new String[]{"(84)-(0978589648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(222222222)"};

    public static void main(String[] args) {
        phoneNumberRegex = new PhoneNumberRegex();
        for (String s : validNumber) {
            boolean isValid = phoneNumberRegex.validate(s);
            System.out.println(s + " is valid:? " + isValid);
        }
        for (String s : invalidNumber) {
            boolean isValid = phoneNumberRegex.validate(s);
            System.out.println(s + " is valid:? " + isValid);
        }
    }
}

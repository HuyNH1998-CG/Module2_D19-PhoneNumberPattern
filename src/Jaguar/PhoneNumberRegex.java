package Jaguar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static final String phoneRegex = "^[()0-9]{4}-[(][0][0-9]{9}[)]";
    public PhoneNumberRegex(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

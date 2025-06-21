package example;

import java.util.regex.Pattern;

/*Create the UserValidator  class which with the validateEmails  method will be
responsible for validating user data such as: email, alternative email. Within the
scope of the validateEmails  method, please create the local Email  class
which will be responsible for formatting the provided email. Validation should
cover the following scenarios:
if the given email address is empty or it is null, set the value to unknown
if the given email address does not meet the email criteria, set the value to
unknown  (use regular expressions*/
public class UserValidator {

    public static void validateEmail(String primaryEmail,String alternativeEmail) {
        Email email =new Email();

        //valido primary email
        String validatePrimaryEmail1= email.validate(primaryEmail);
        System.out.println(validatePrimaryEmail1);

        String validateAlternativeEmail=email.validate(alternativeEmail);
        System.out.println(validateAlternativeEmail);
    }

    //INNER CLASS
    private static class Email{
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        private static final String UNKNOWN="unknown";

        //validimin dhe formatimin e emailit
        public String validate(String email){
            if(email== null || email.trim().isEmpty()){
                return UNKNOWN;
            }
            if(!Pattern.matches(EMAIL_REGEX,email)){
                return UNKNOWN;
            }
            return formatEmail(email);
        }

        //Krijojme metoden per formatimin e Emailit
        private String formatEmail(String email){
            return email.trim().toLowerCase();
        }
    }

    public static void main(String[] args) {
        validateEmail("kena@example.com","kena-email");
        validateEmail(null," ");
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ValidPhoneNumber {
 public void validPhoneNumber(String phoneNumber);
}

interface ValidNameFormate {
    public void  validNameFormate(String Name);
}

interface ValidPassword{
    public void validPasswordCheck(String password);
}

interface ValidEmail {
    public void validEmailCheck(String email);
}
public class UserRegistrationProblem {

    static UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("Enter the first Name");
        String firstName = in.next();
        userRegistrationProblem.validName(firstName);

        System.out.println("Enter the Last Name");
        String lastName = in.next();
        userRegistrationProblem.validName(lastName);

        System.out.println("Enter valid Email");
        String email = in.next();
        userRegistrationProblem.validEmail(email);

        System.out.println("Enter phone Number");
        String phoneNumber = in.next();
        userRegistrationProblem.validPhoneFormat(phoneNumber);

        System.out.println("Enter valid Password");
        String password = in.next();
        userRegistrationProblem.validPasswordFormate(password);

        ValidPhoneNumber  validPhoneNumber = (String phoneNumber1)-> {
                Pattern pattern = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
                Matcher matcher = pattern.matcher(phoneNumber1);
                if(matcher.matches()){
                    System.out.println("valid Phone number");
                }
                else {
                    System.out.println("not valid phoneNumber");
                }
        };
        validPhoneNumber.validPhoneNumber(phoneNumber);

        ValidNameFormate validNameFormate = (String name) ->{
            Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher matcher = pattern.matcher(name);

            if(matcher.matches()){
                System.out.println("Valid Name");
            }
            else {
                System.out.println("Not Valid Name");
            }
        };
        validNameFormate.validNameFormate(firstName);

        ValidPassword validPassword = (String password1) -> {
            Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
            Matcher matcher = pattern.matcher(password1);
            if(matcher.matches()){
                System.out.println("valid Password");
            }
            else {
                System.out.println("Not valid password");
            }
        };
        validPassword.validPasswordCheck(password);

        ValidEmail validEmail = (String email1)->{
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[\"bl.co?.in\"]+$");
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                System.out.println("valid Email");
            }
            else {
                System.out.println("Invalid Email");
            }
        };
    }

    public boolean validPhoneFormat(String phoneNumber){
        Pattern pattern = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            System.out.println("valid Phone number");
            return true;
        }
        else {
            System.out.println("not valid phoneNumber");
            return false;
        }
    }

    public boolean validPasswordFormate(String password){
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            System.out.println("valid Password");
            return true;
        }
        else {
            System.out.println("Not valid password");
            return false;
        }
    }

    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[\"bl.co?.in\"]+$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("valid Email");
            return true;
        }
        else {
            System.out.println("Invalid Email");
            return false;
        }
    }

    public boolean validName(String name) {

        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(name);

        if(matcher.matches()){
            System.out.println("Valid Name");
            return true;
        }
        else {
            System.out.println("Not Valid Name");
            return false;
        }
    }
}

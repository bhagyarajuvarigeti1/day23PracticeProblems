import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationProblemTest {

    static UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
    @Test
    public void validNameTester() {

        assertEquals(true,userRegistrationProblem.validPhoneFormat("91 9919819801"));
    }

    @Test
    public void validNameTest(){
        assertEquals(true,userRegistrationProblem.validName("Bhagyaraju"));
    }

    @Test
    public void validEmailTest(){
        assertEquals(true,userRegistrationProblem.validEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void validPasswordTest(){
        assertEquals(true,userRegistrationProblem.validPasswordFormate("Name@1234"));
    }
}
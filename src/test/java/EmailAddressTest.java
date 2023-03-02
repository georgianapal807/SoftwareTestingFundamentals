import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailAddressTest {

    private EmailAddress email;

    @BeforeEach
    void init() {
        email = new EmailAddress();
    }

    @Test
    public void isValidEmailTest1() {
        String emailAddress = "username@domain.com";
        Assertions.assertEquals(true, email.isValidEmailAddress(emailAddress));
    }

    @Test
    public void isValidEmailTest2() {
        String emailAddress = "username+100@domain.com";
        Assertions.assertEquals(true, email.isValidEmailAddress(emailAddress));
    }

    @Test
    public void isValidEmailTest3() {
        String emailAddress = "@domain.com.";
        Assertions.assertEquals(false, email.isValidEmailAddress(emailAddress));
    }

    @Test
    void isEmptyEmail() {
        Assertions.assertEquals(true, email.isEmptyEmailAddress("            "));
    }

    @Test
    void isEmptyEmailTest2() {
        Assertions.assertEquals(true, email.isEmptyEmailAddress(""));
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void receivingMoneyTest() {
        Account account = new Account();
        account.balance = 100;
        account.nameOfTheOwner = "John";
        account.accountNumber = "RO4234553XXXX";
        Assertions.assertEquals(account.RecivingFrom(100), 200);
    }

    @Test
    void transferToTest() {
        Account account = new Account();
        account.balance = 100;
        account.nameOfTheOwner = "John";
        account.accountNumber = "RO4234553XXXXRO4234553XXXX";
        Assertions.assertEquals(account.TransferTo(20), 80);
    }

    @Test
    void transferExceedingBalanceToTest() {
        Account account = new Account();
        account.balance = 100;
        account.nameOfTheOwner = "John";
        account.accountNumber = "RO4234553XXXXRO4234553XXXX";
        Assertions.assertEquals(account.TransferTo(200), 100);
    }

    @Test
    void bankAccountIsValid() {
        Account account = new Account();
        account.balance = 100;
        account.nameOfTheOwner = "John";
        account.accountNumber = "RO4234553XXXXRO4234553XXXX";
        Assertions.assertEquals(account.isBankAccountValid(account.accountNumber), true);
    }

    @Test
    void bankAccountIsNotValid() {
        Account account = new Account();
        account.balance = 100;
        account.nameOfTheOwner = "John";
        account.accountNumber = "RO423";
        Assertions.assertEquals(account.isBankAccountValid(account.accountNumber), false);
    }
}
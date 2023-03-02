public class Account {
    float balance;
    String nameOfTheOwner;
    String accountNumber;

    public float TransferTo(float amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("The transfer exceeded balance");
        }
        return this.balance;
    }

    public float RecivingFrom(float amount) {
        this.balance += amount;
        return this.balance;
    }

    public boolean isBankAccountValid(String bankAccount){
        return (bankAccount.length()==26);
    }
}

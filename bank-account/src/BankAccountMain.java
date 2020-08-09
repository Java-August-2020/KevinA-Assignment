import java.math.BigDecimal;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getCheckingBalance());
        bankAccount.getDepositAmount("checking", 100.00);
        System.out.println(bankAccount.getCheckingBalance());
        bankAccount.getDepositAmount("checking", 100.00);
        System.out.println(bankAccount.getCheckingBalance());

        bankAccount.getDepositAmount("savings",200);


        bankAccount.getWithdrawalAmount("checking", 100.00);
        System.out.println(bankAccount.getCheckingBalance());


        bankAccount.totalAmountOfMoney();

    }
}

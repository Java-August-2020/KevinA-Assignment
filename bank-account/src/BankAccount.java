
public class BankAccount {
    private static final String CHECKING_ACCOUNT = "checking";
    private static final String SAVINGS_ACCOUNT = "savings";
    private static final String INSUFFICIENT_FUNDs = "Insufficient Funds";
    private static int numberOfAccounts = 0;
    private static double totalAmountOfMoneyInAccountCreated = 0;
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    public BankAccount() {
        this.accountNumber = randomAccountNumber();
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private String randomAccountNumber() {
        String random = "";
        int randomNumber = 0;
        for (int i = 0; i < 10; i++) {
            randomNumber = (int) (Math.random() * (10 - 0 + 1) + 0);
            random += Integer.toString(randomNumber);

        }
        return random;
    }

    private double depositMoney(String accountType, double depositAmount) {


        if (accountType.equalsIgnoreCase(CHECKING_ACCOUNT)) {
            checkingBalance = this.getCheckingBalance() + depositAmount;
            totalAmountOfMoneyInAccountCreated += depositAmount;
        } else if (accountType.equalsIgnoreCase(SAVINGS_ACCOUNT)) {
            savingsBalance = this.getSavingsBalance() + depositAmount;
            totalAmountOfMoneyInAccountCreated += depositAmount;
        }
        return depositAmount;


    }

    private double withdrawMoney(String accountType, double withdrawalAmount) {
        if (accountType.equalsIgnoreCase(CHECKING_ACCOUNT)) {
            if (withdrawalAmount > checkingBalance) {
                System.out.println(INSUFFICIENT_FUNDs);

            } else {
                checkingBalance -= withdrawalAmount;
                totalAmountOfMoneyInAccountCreated -= withdrawalAmount;
            }
        } else if (accountType.equalsIgnoreCase(SAVINGS_ACCOUNT)) {
            if (withdrawalAmount > savingsBalance) {
                System.out.println(INSUFFICIENT_FUNDs);
            } else {
                savingsBalance -= withdrawalAmount;
                totalAmountOfMoneyInAccountCreated -= withdrawalAmount;
            }
        }
        return withdrawalAmount;
    }

    public double getWithdrawalAmount(String accountType, double withdrawalAmount) {
       return withdrawMoney(accountType, withdrawalAmount);
    }

    public double getDepositAmount(String accountType, double depositAmount) {
        return depositMoney(accountType, depositAmount);
    }

    public void totalAmountOfMoney() {
         System.out.println("Total Amount is $" + totalAmountOfMoneyInAccountCreated);

    }
}

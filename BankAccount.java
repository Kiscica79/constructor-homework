public class BankAccount {

    // TODO
    // 1.a
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // 2.b paraméteres konstruktőr
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // default konstruktőr
    public BankAccount() {
        this("44444444", "Mekk Elek", 33333.333);
    }

    // 1.b setterek
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // 1.b getterek
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }



}

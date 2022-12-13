package CodeWars.bankaccount;

public class BankAccount {
    private String bankAccount;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds (double deposit){
        balance += deposit;
        System.out.println("Current balance: " + balance );
    }
    public void withdrawFunds (double withdraw){
        if (balance - withdraw < 0){
            System.out.println("Available funds: "+ balance +". You can not withdraw more than that.");
        } else{
            balance -= withdraw;
            System.out.println("Current balance: " + balance);
        }
    }
}

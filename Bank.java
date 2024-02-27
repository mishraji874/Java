public class Bank {
    public int accountNumber;
    public double balance;
    public String name;
    public String email;
    public int number;

    public Bank() {
        this(567, 2, "Default name", "Default address", 579067897);
        System.out.println("Empty constructor called");
    }
    public Bank(int accountNumber, float balance, String name, String email, int number) {
        System.out.println("Account constructor with parameters call");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.number = number;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public double getBalance() {
        this.balance = this.balance + balance;
        return this.balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if(balance - amount <= 0) {
            System.out.println("Only " + balance + " avaliable. Withdrawl not processed");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawl of " + amount + " processed. Remaining balance: " + balance);
        }
    }
}
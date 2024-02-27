public class ClassChallenge {
    //create a new class for a bank account
    //create fields for the bank account number, balance, customer name, email, and phone number
    //create getters and setters for each field
    //create two additional methods
    //1. to allow the customer to deposit funds (this should increment the balance field)
    //2. to allow the customer to withdraw funds. this should deduct from the balance field,
    //but not allow the withdrawal to complete if their are insufficient funds.
    //you will want to create various code in main class (the one created by IntelliJ) to
    //confirm your code is working.
    //add some System.out.println's in the two methods above as well.

    public static void main(String[] args) {
        Bank bobsAccount = new Bank(12345, 0, "Bob", "bob@gmail.com", 123456789);
        //bobsAccount.setAccountNumber(12345);
        //bobsAccount.setBalance(0);
        //bobsAccount.setName("Bob");
        //bobsAccount.setEmail("bob@gmail.com");
        //bobsAccount.setNumber(123456789);
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw(100);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(1000);
        bobsAccount.deposit(51);

        Bank timAccount = new Bank(3456, 56, "Tim", "tim@email.com", 1234);
        System.out.println(timAccount.getNumber() + " name " + timAccount.getName());    
    }
}

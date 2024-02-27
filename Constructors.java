public class Constructors {
    //create a new class VipCustomer
    //it should have 3 fields name, credit limit, and email address
    //create 3 constructors
    //1st constructor empty should call the constructor with 3 parameters with default values
    //2nd constructor should pass on the 2 values it recieves and add a default value for the 3rd
    //3rd constructor should save all fields
    //create getters only for this using code generation of intellij as setters won't be needed
    //test and confirm it works.

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
    }
}
public class VipCustomer {
    //create a new class VipCustomer
    //it should have 3 fields name, credit limit, and email address
    //create 3 constructors
    //1st constructor empty should call the constructor with 3 parameters with default values
    //2nd constructor should pass on the 2 values it recieves and add a default value for the 3rd
    //3rd constructor should save all fields
    //create getters only for this using code generation of intellij as setters won't be needed
    //test and confirm it works.

    public String name;
    public double limit;
    public String email;

    public VipCustomer() {
        this("Default name", 50000.00, "default");
    }
    public VipCustomer(String name, double limit) {
        this.name = name;
        this.limit = limit;
        this.email = "unknown@email.com";
    }
    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public double getLimit() {
        return limit;
    }
    public String getEmail() {
        return email;
    }
}

public class Scope {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        SuperCheck scopeInstance = new SuperCheck();
        System.out.println("scopeInstance privatVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        SuperCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}

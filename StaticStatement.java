public class StaticStatement {

    public static int multiplier = 7;
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstance());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstance());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstance());

        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}

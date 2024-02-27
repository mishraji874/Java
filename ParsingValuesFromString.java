public class ParsingValuesFromString {
    public static void main(String[] args) {
        String numberAString = "2018.125";
        System.out.println("numberAsString= " + numberAString);

        double number = Double.parseDouble(numberAString);
        System.out.println("number= " + number);

        numberAString += 1;
        number += 1;
        System.out.println("numberAsString= " + numberAString);
        System.out.println("number= " + number);
    }
}

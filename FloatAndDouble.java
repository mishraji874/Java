public class FloatAndDouble {
    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue =  5.25f;
        double myDoubleValue = 5.25d;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        //Challenge

        double pound = 4;
        double kg = pound * 0.45359237;
        System.out.println(kg);

        double pi = 3.1415927d;
        double number = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(number);
    }
}
public class MathClass {
    public static void main(String[] args) {
        System.out.println("Absolute: ");
        System.out.println(Math.abs(-123));

        System.out.println("Absolute: ");
        System.out.println(StrictMath.abs(-123));

        System.out.println("Cube Root: ");
        System.out.println(Math.cbrt(9));

        System.out.println("Exact Decrement: ");
        System.out.println(Math.decrementExact(7));

        System.out.println("Exponent value in floating point rep. : ");
        System.out.println(Math.getExponent(12.3456));

        System.out.println("Convert to radians: ");
        System.out.println(Math.toRadians(90));

        System.out.println("Round Division: ");
        System.out.println(Math.floorDiv(50, 9));

        System.out.println("e to the power x: ");
        System.out.println(StrictMath.exp(1));

        System.out.println("e power x: ");
        System.out.println(StrictMath.exp(1));

        System.out.println("Log base 10: ");
        System.out.println(Math.log10(100));

        System.out.println("Maximum: ");
        System.out.println(Math.max(100, 50));

        System.out.println("Tan: ");
        System.out.println(Math.tan(45*Math.PI/180));

        System.out.println("Convert to Radians: ");
        System.out.println(Math.toRadians(90));

        System.out.println("Convert to degree: ");
        System.out.println(Math.toDegrees(Math.atan(1)));

        System.out.println("Convert to degree: ");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        System.out.println("Random: ");
        System.out.println(Math.random());

        System.out.println("Power: ");
        System.out.println(Math.pow(2, 3));

        System.out.println("Exact Product: ");
        System.out.println(Math.multiplyExact(100, 200));

        System.out.println("Next Float Value: ");
        System.out.println(Math.nextAfter(12.5, 13));
    }
}

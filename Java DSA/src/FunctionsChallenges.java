public class FunctionsChallenges {
    public static boolean isEven(int n) {
        if(n % 2 == 0)
            return true;
        return false;
    }
    public static float average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void palindrome(int n) {
        int rem, last = 0, temp;
        temp = n;
        while (n > 0) {
            rem = n % 10;
            last = (last * 10) + rem;
            n = n / 10;
        }
        if (temp == last)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        System.out.println(average(2, 3, 4));
        System.out.println(isEven(2));
        palindrome(121);
    }
}

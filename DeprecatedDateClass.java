import java.util.*;

public class DeprecatedDateClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);

        Date d = new Date();
        //Date d = new Date("1/1/1980");
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear() + 1900);
    }
}

enum Dept {
    CS,IT,CIVIL,ECE;
    public String name;
    public String original;
    
    private static void Dept() {
        System.out.println(this.name());
    }
    public static void display() {
        System.out.println(this.name() + " " + this.original());
    }
}

public class Enum {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.ordinal());
        System.out.println(d.name());
        System.out.println(d.valueOf("IT"));

        Dept list[] = Dept.values();
        for(Dept x:list) {
            System.out.println(x);
        }

        switch (d) {
            case CS:
                System.out.println("Head: John \nBlock: A");
                break;
            case IT:
                System.out.println("Head: Smith \nBlock: B");
                break;
            case CIVIL:
                System.out.println("Head: Srinivas \nBlock: C");
                break;
            case ECE:
                System.out.println("Head: Dave \nBlock: D");
            default:
                break;
        }

        d.display();
    }
}

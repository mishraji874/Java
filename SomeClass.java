public class SomeClass {
    public final int instanceNumber;
    public static int classCounter = 0;
    private final String name;

    public SomeClass(String name) {
        instanceNumber = classCounter;
        this.name = name;
        classCounter++;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

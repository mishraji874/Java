public class Cars extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Cars(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

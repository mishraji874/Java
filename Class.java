public class Class {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car(); 
        //System.out.println("Model is " + porsche.getModel());
        porsche.setModel("922");
        System.out.println("Model is " + porsche.getModel());
    }
}
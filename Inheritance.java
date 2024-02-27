public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
        dog.move(7);

        Fish fish = new Fish("Star Fish", 5, 7, 3, 2, 2);
        fish.swim(25);
    }
}

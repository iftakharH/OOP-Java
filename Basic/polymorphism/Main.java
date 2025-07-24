public class Main {
    public static void main(String[] args) {
        // Creating objects
        Animal genericAnimal = new Animal("Generic");
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", true);
        
        // Demonstrating method overriding
        System.out.println("=== Method Overriding Demo ===");
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
        
        System.out.println();
        genericAnimal.eat();
        dog.eat();
        cat.eat();
        
        // Demonstrating polymorphism with array
        System.out.println("\n=== Polymorphism with Array ===");
        Animal[] animals = {genericAnimal, dog, cat};
        
        for (Animal animal : animals) {
            animal.makeSound(); // Calls overridden method based on actual object type
        }
        
        // Demonstrating method overloading
        System.out.println("\n=== Method Overloading Demo ===");
        dog.sleep();        // No parameters
        dog.sleep(8);       // With parameter
        
        dog.play();         // No parameters
        dog.play("ball");   // With parameter
        
        // Specific methods for each class
        System.out.println("\n=== Class-specific Methods ===");
        cat.climb();
        
        // Runtime polymorphism
        System.out.println("\n=== Runtime Polymorphism ===");
        Animal animalRef = new Dog("Max", "Labrador");
        animalRef.makeSound(); // Calls Dog's makeSound method
        
        animalRef = new Cat("Fluffy", false);
        animalRef.makeSound(); // Calls Cat's makeSound method
    }
}
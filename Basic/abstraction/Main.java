public class Main {
    public static void main(String[] args) {
        // Creating objects
        Circle circle = new Circle("Red", 10, 20, 5.0);
        Rectangle rectangle = new Rectangle("Blue", 0, 0, 4.0, 6.0);
        
        System.out.println("=== Abstraction Demo ===");
        
        // Using interface static method
        Drawable.printInfo();
        
        // Drawing shapes
        System.out.println("\n--- Drawing Shapes ---");
        circle.draw();
        rectangle.draw();
        
        // Using default method from interface
        System.out.println("\n--- Using Default Methods ---");
        circle.display();
        rectangle.display();
        
        // Calculating areas (abstract method implementation)
        System.out.println("\n--- Shape Information ---");
        circle.printInfo();
        System.out.println();
        rectangle.printInfo();
        
        // Moving shapes (interface implementation)
        System.out.println("\n--- Moving Shapes ---");
        circle.move(50, 60);
        rectangle.move(100, 200);
        
        // Using interface default method
        System.out.println("\n--- Reset Positions ---");
        circle.resetPosition();
        rectangle.resetPosition();
        
        // Polymorphism with interfaces and abstract classes
        System.out.println("\n--- Polymorphism with Abstraction ---");
        Shape[] shapes = {circle, rectangle};
        Drawable[] drawables = {circle, rectangle};
        Movable[] movables = {circle, rectangle};
        
        System.out.println("Drawing all shapes:");
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
        
        System.out.println("\nCalculating areas:");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + 
                             String.format("%.2f", shape.calculateArea()));
        }
        
        System.out.println("\nMoving all objects to (25, 25):");
        for (Movable movable : movables) {
            movable.move(25, 25);
        }
    }
}
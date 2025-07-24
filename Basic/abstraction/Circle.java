/**
 * Circle class demonstrating multiple OOP concepts:
 * 1. Inheritance - extends the abstract Shape class
 * 2. Interface Implementation - implements the Movable interface
 * 3. Polymorphism - provides specific implementations for abstract methods
 * 4. Encapsulation - private fields with public getter methods
 */
class Circle extends Shape implements Movable {
    // Private field for encapsulation - radius can only be accessed through methods
    private double radius;
    
    /**
     * Constructor that calls the parent class constructor using super()
     * Demonstrates constructor chaining in inheritance
     */
    public Circle(String color, int x, int y, double radius) {
        // Call parent class (Shape) constructor to initialize inherited fields
        super(color, x, y);
        // Initialize the Circle-specific field
        this.radius = radius;
    }
    
    /**
     * Implementation of abstract method from Shape class
     * @Override annotation ensures we're correctly overriding the parent method
     * Demonstrates polymorphism - each shape calculates area differently
     */
    @Override
    public double calculateArea() {
        // Circle area formula: π × radius²
        return Math.PI * radius * radius;
    }
    
    /**
     * Implementation of abstract method from Drawable interface (inherited through Shape)
     * Provides Circle-specific drawing behavior
     * Demonstrates polymorphism - each shape draws differently
     */
    @Override
    public void draw() {
        // Access inherited protected fields (color, x, y) from Shape class
        System.out.println("Drawing a " + color + " circle with radius " + radius + 
                          " at position (" + x + ", " + y + ")");
    }
    
    /**
     * Implementation of method from Movable interface
     * Demonstrates multiple interface implementation
     * Updates the position coordinates inherited from Shape
     */
    @Override
    public void move(int newX, int newY) {
        System.out.println("Moving circle from (" + x + ", " + y + ") to (" + newX + ", " + newY + ")");
        // Update inherited protected fields from Shape class
        this.x = newX;
        this.y = newY;
    }
    
    /**
     * Getter method for encapsulated radius field
     * Provides controlled access to private data
     * Demonstrates encapsulation principle
     */
    public double getRadius() {
        return radius;
    }
}
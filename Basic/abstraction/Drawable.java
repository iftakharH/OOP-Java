// Interface demonstrating abstraction
interface Drawable {
    void draw(); // Abstract method
    
    // Default method (Java 8+)
    default void display() {
        System.out.println("Displaying the drawable object");
    }
    
    // Static method
    static void printInfo() {
        System.out.println("This is a Drawable interface");
    }
}
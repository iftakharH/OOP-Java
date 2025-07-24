// Abstract class demonstrating abstraction
abstract class Shape implements Drawable {
    protected String color;
    protected int x, y;
    
    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    // Abstract method
    public abstract double calculateArea();
    
    // Concrete method
    public void printInfo() {
        System.out.println("Shape at (" + x + ", " + y + ") with color: " + color);
        System.out.println("Area: " + calculateArea());
    }
    
    // Getter methods
    public String getColor() {
        return color;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
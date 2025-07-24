// Another concrete class
class Rectangle extends Shape implements Movable {
    private double width, height;
    
    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle " + width + "x" + height + 
                          " at position (" + x + ", " + y + ")");
    }
    
    @Override
    public void move(int newX, int newY) {
        System.out.println("Moving rectangle from (" + x + ", " + y + ") to (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
}
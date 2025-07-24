
class Point{
    double x_axis;
    double y_axis;
    
    public Point(double x, double y){
        x_axis=x;
        y_axis=y;
    }
    
    public static double distanceCalc(Point p1, Point p2){
        double dx= p1.x_axis - p2.x_axis;
        double dy= p1.y_axis - p2.y_axis;
        
        return Math.sqrt(dx*dx + dy*dy);
    }
}

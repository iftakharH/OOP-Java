// DVD class demonstrating inheritance and method overriding
class DVD extends LibraryItem {
    private String director;
    private int duration; // in minutes
    private String rating;
    
    public DVD(String title, String id, String director, int duration, String rating) {
        super(title, id);
        this.director = director;
        this.duration = duration;
        this.rating = rating;
    }
    
    @Override
    public String getItemType() {
        return "DVD";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== DVD INFORMATION ===");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed by " + borrower));
    }
    
    // DVD-specific methods
    public String getDirector() {
        return director;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String getRating() {
        return rating;
    }
}
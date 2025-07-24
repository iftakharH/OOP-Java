// Book class demonstrating inheritance and method overriding
class Book extends LibraryItem {
    private String author;
    private int pages;
    private String genre;
    
    public Book(String title, String id, String author, int pages, String genre) {
        super(title, id);
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }
    
    @Override
    public String getItemType() {
        return "Book";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== BOOK INFORMATION ===");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed by " + borrower));
    }
    
    // Book-specific methods
    public String getAuthor() {
        return author;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String getGenre() {
        return genre;
    }
}
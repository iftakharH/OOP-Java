public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("Central City Library");
        
        // Create books and DVDs
        Book book1 = new Book("The Java Programming Language", "B001", "James Gosling", 400, "Programming");
        Book book2 = new Book("Clean Code", "B002", "Robert Martin", 350, "Programming");
        DVD dvd1 = new DVD("The Matrix", "D001", "Wachowski Sisters", 136, "R");
        DVD dvd2 = new DVD("Inception", "D002", "Christopher Nolan", 148, "PG-13");
        
        // Add items to library
        System.out.println("=== ADDING ITEMS TO LIBRARY ===");
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);
        
        // Add a book using overloaded method
        library.addItem("Design Patterns", "B003", "Gang of Four", 395, "Programming");
        
        System.out.println("Successfully added " + library.getItemCount() + " items to the library.");
        
        // Display all items
        library.displayAllItems();
        
        // Display available items
        library.displayAvailableItems();
        
        // Borrow some items
        System.out.println("\n=== BORROWING ITEMS ===");
        LibraryItem item1 = library.findItem("B001");
        if (item1 != null && item1.borrow("Alice Johnson")) {
            System.out.println("Alice borrowed: " + item1.getTitle());
        }
        
        LibraryItem item2 = library.findItem("D001");
        if (item2 != null && item2.borrow("Bob Smith")) {
            System.out.println("Bob borrowed: " + item2.getTitle());
        }
        
        // Try to borrow already borrowed item
        if (item1 != null && !item1.borrow("Charlie Brown")) {
            System.out.println("Charlie could not borrow '" + item1.getTitle() + 
                             "' - already borrowed by " + item1.getBorrower());
        }
        
        // Display available items after borrowing
        library.displayAvailableItems();
        
        // Return an item
        System.out.println("\n=== RETURNING ITEMS ===");
        if (item1 != null && item1.returnItem()) {
            System.out.println("'" + item1.getTitle() + "' has been returned.");
        }
        
        // Display final state
        System.out.println("\n=== FINAL LIBRARY STATE ===");
        library.displayAvailableItems();
        
        // Demonstrate polymorphism
        System.out.println("\n=== POLYMORPHISM DEMO ===");
        LibraryItem[] allItems = {book1, book2, dvd1, dvd2};
        
        for (LibraryItem item : allItems) {
            System.out.println(item.getItemType() + ": " + item.getTitle() + 
                             " - " + (item.isAvailable() ? "Available" : "Borrowed"));
        }
    }
}
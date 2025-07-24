// Library class demonstrating composition and encapsulation
class Library {
    private String name;
    private LibraryItem[] items;
    private int itemCount;
    private static final int MAX_ITEMS = 100;
    
    public Library(String name) {
        this.name = name;
        this.items = new LibraryItem[MAX_ITEMS];
        this.itemCount = 0;
    }
    
    // Method overloading
    public boolean addItem(LibraryItem item) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount] = item;
            itemCount++;
            return true;
        }
        return false;
    }
    
    public boolean addItem(String title, String id, String author, int pages, String genre) {
        return addItem(new Book(title, id, author, pages, genre));
    }
    
    public LibraryItem findItem(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }
    
    public void displayAllItems() {
        System.out.println("\n=== LIBRARY: " + name + " ===");
        System.out.println("Total items: " + itemCount);
        
        for (int i = 0; i < itemCount; i++) {
            System.out.println("\n" + (i + 1) + ". " + items[i].getItemType() + 
                             " - " + items[i].getTitle());
            items[i].displayInfo();
        }
    }
    
    public void displayAvailableItems() {
        System.out.println("\n=== AVAILABLE ITEMS ===");
        int availableCount = 0;
        
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isAvailable()) {
                System.out.println((availableCount + 1) + ". " + items[i].getItemType() + 
                                 " - " + items[i].getTitle() + " (ID: " + items[i].getId() + ")");
                availableCount++;
            }
        }
        
        if (availableCount == 0) {
            System.out.println("No items available for borrowing.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getItemCount() {
        return itemCount;
    }
}
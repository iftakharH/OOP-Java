// Abstract base class for library items
abstract class LibraryItem implements Borrowable {
    protected String title;
    protected String id;
    protected boolean isAvailable;
    protected String borrower;
    
    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.isAvailable = true;
        this.borrower = null;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract String getItemType();
    public abstract void displayInfo();
    
    // Common implementation for borrowing
    @Override
    public boolean borrow(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            this.isAvailable = false;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean returnItem() {
        if (!isAvailable) {
            this.borrower = null;
            this.isAvailable = true;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getId() {
        return id;
    }
    
    public String getBorrower() {
        return borrower;
    }
}
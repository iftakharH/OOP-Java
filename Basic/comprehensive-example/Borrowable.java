// Interface for items that can be borrowed
interface Borrowable {
    boolean borrow(String borrower);
    boolean returnItem();
    boolean isAvailable();
}
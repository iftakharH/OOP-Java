// Another interface for multiple interface implementation
interface Movable {
    void move(int x, int y);
    
    default void resetPosition() {
        move(0, 0);
    }
}
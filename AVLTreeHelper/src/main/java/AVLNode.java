import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AVLNode<T> {
    private AVLNode<T> left;
    private AVLNode<T> right;
    private int balance;
    private int height;
    private int key;
    private T data;

    public AVLNode(int key, T data) {
        this.key = key;
        this.data = data;
    }
}
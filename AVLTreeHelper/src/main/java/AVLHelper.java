
public class AVLHelper {
    public static <T> int getHeight(AVLNode<T> node){
        return node == null ? 0 : node.getHeight();
    }

    public static <T> AVLNode<T> rotateLeft(AVLNode<T> node){

        AVLNode<T> leftChild =  node.getLeft();
        AVLNode<T> tmp = leftChild.getRight();

        leftChild.setRight(node);
        node.setLeft(tmp);


        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight()) + 1));
        leftChild.setHeight(Math.max(getHeight(leftChild.getLeft()), getHeight(leftChild.getRight()) + 1));


        return leftChild;
    }

    public static <T> AVLNode<T> rotateRight(AVLNode<T> node){

        AVLNode<T> rightChild = node.getRight();
        AVLNode<T> tmp = rightChild.getLeft();

        rightChild.setLeft(node);
        node.setRight(tmp);


        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
        rightChild.setHeight(Math.max(getHeight(rightChild.getLeft()), getHeight(rightChild.getRight())) + 1);


        return rightChild;
    }
}

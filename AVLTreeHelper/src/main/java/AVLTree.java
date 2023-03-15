
public class AVLTree<T> {
    private AVLNode<T> root;

    public AVLNode<T> add(int key, T data){
        return add(key, data, root);
    }

    public AVLNode<T> add(int key, T data, AVLNode<T> node){
        if(node == null){
            return new AVLNode<>(key, data);
        }

        if(key < node.getKey()){
            node.setRight(add(key, data, node.getLeft()));
        }
        else if(key > node.getKey()){
            node.setRight(add(key, data, node.getRight()));
        }
        return balanceTree(key, node);
    }

    private AVLNode<T> balanceTree(int key, AVLNode<T> node){
        int balance = node.getBalance();
        if(balance > 1 ){
            if(key < node.getLeft().getKey()){
                return AVLHelper.rotateLeft(node);
            } else if(key > node.getLeft().getKey()) {

                AVLNode<T> tmpRoot = AVLHelper.rotateRight(node.getLeft());
                node.setLeft(tmpRoot);
                return AVLHelper.rotateLeft(node);
            }
        }

        if(balance < -1){
            //RR
            if(key > node.getRight().getKey()){
                return AVLHelper.rotateRight(node);
            } else if(key < node.getRight().getKey()) {

                AVLNode<T> tmpRoot = AVLHelper.rotateLeft(node.getRight());
                node.setRight(tmpRoot);
                return AVLHelper.rotateRight(node);
            }
        }

        return node;
    }
}

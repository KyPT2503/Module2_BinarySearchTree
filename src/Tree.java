public interface Tree<E> {
    boolean insert(E e);
    String inOrder();
    String postOrder();
    String preOrder();
    int size();
    boolean search(E e);
}

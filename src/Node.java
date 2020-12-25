public class Node<E extends Comparable<E>> {
    public E data;
    public Node<E> leftSubNode;
    public Node<E> rightSubNode;

    public Node(E data) {
        this.data = data;
        this.leftSubNode = null;
        this.rightSubNode = null;
    }
}

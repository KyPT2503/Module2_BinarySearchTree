import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> implements Tree<E>, Iterable<E> {
    private Node<E> origin;
    private int size;

    public BinarySearchTree() {
        this.origin = new Node<E>(null);
        this.size = 0;
    }

    @Override
    public boolean insert(E e) {
        if (this.origin.data == null) {
            this.origin.data = e;
            this.size += 1;
            return true;
        }
        Node<E> node = origin;
        while (node.data.compareTo(e) != 0) {
            if (node.data.compareTo(e) > 0) {
                if (node.leftSubNode == null) {
                    node.leftSubNode = new Node<E>(e);
                    this.size += 1;
                    return true;
                }
                node = node.leftSubNode;
            } else {
                if (node.rightSubNode == null) {
                    node.rightSubNode = new Node<E>(e);
                    this.size += 1;
                    return true;
                }
                node = node.rightSubNode;
            }
        }
        return false;
    }

    @Override
    public String inOrder() {
        String result = "[";
        if (this.origin != null) result += inOrder(this.origin);
        return result + "]";
    }

    public String inOrder(Node<E> node) {
        String result = "";
        if (node.leftSubNode != null) {
            result += inOrder(node.leftSubNode) + ", ";
        }
        result += node.data.toString();
        if (node.rightSubNode != null) {
            result += ", " + inOrder(node.rightSubNode);
        }
        return result;
    }

    @Override
    public String postOrder() {
        String result = "[";
        if (this.origin != null) result += postOrder(this.origin);
        return result + "]";
    }

    public String postOrder(Node<E> node) {
        String result = "";
        if (node.leftSubNode != null) {
            result += postOrder(node.leftSubNode) + ", ";
        }
        if (node.rightSubNode != null) {
            result += postOrder(node.rightSubNode) + ", ";
        }
        return result + node.data;
    }

    @Override
    public String preOrder() {
        String result = "[";
        if (this.origin != null) result += preOrder(this.origin);
        return result + "]";
    }

    public String preOrder(Node<E> node) {
        String result = node.data.toString();
        if (node.leftSubNode != null) {
            result += ", " + preOrder(node.leftSubNode);
        }
        if (node.rightSubNode != null) {
            result += ", " + preOrder(node.rightSubNode);
        }
        return result;
    }

    @Override
    public boolean search(E e) {
        return search(e, this.origin);
    }

    public boolean search(E e, Node<E> node) {
        if (node == null) return false;
        if (node.data.compareTo(e) < 0) {
            return search(e, node.rightSubNode);
        }
        if (node.data.compareTo(e) > 0) {
            return search(e, node.leftSubNode);
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new BSTIterator<>();
    }

    class BSTIterator<E> implements Iterator<E> {
        Node node = origin;
        List<E> es = new ArrayList<E>();

        public BSTIterator() {

        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            return null;
        }
    }
}

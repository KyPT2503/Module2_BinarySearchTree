public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> integers = new BinarySearchTree<>();
        System.out.println(integers.insert(1));
        System.out.println(integers.insert(3));
        System.out.println(integers.insert(2));
        System.out.println(integers.insert(-1));
        System.out.println(integers.insert(9));
        System.out.println(integers.insert(0));
        System.out.println(integers.size());
        System.out.println(integers.inOrder());
        System.out.println(integers.postOrder());
        System.out.println(integers.preOrder());
        System.out.println(integers.search(3));
        System.out.println(integers.search(-100));

        BinarySearchTree<String> tree = new BinarySearchTree<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println(tree.inOrder());
        System.out.println(tree.postOrder());
        System.out.println(tree.preOrder());
        System.out.println("The number of nodes is: " + tree.size());
    }
}

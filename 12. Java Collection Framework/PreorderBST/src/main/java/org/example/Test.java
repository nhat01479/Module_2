package org.example;
//Root --> cây con bên trái --> cây con bên phải
public class Test {
    public static void main(String[] args) {
        PreorderBST<Integer> tree = new PreorderBST<>();
//        tree.root = new PostorderBST.TreeNode<>("George");
        tree.insert(14);//root
        tree.insert(27);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
        //traverse tree
//        tree.insert("George");
//        tree.insert("Michael");
//        tree.insert("Tom");
//        tree.insert("Adam");
//        tree.insert("Jones");
//        tree.insert("Peter");
//        tree.insert("Daniel");
        System.out.println("Postorder (sorted)");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}


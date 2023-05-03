package org.example;

public class Test {
    public static void main(String[] args) {
        InorderBST<Integer> tree = new InorderBST<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        //traverse tree
        System.out.println("Inorder (sorted)");
        tree.inorder();

        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree.search(5));
        tree.deleteANode(1);
        tree.inorder();

    }
}
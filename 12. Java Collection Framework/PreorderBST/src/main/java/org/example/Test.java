package org.example;

public class Test {
    public static void main(String[] args) {
        PreorderBST<Integer> tree = new PreorderBST<>();
//        tree.root = new PostorderBST.TreeNode<>("George");
        tree.insert(1); //root
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
//        tree.insert(6);
//        tree.insert(7);
        //traverse tree
        System.out.println("Postorder (sorted)");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}


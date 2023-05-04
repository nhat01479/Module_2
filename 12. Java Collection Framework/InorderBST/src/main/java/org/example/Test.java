package org.example;
//duyệt trung thứ tự: cây con bên trái --> root --> cây con bên phải
public class Test {
    public static void main(String[] args) {
        InorderBST<Integer> tree = new InorderBST<>();
        tree.insert(14);//root
        tree.insert(27);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);

        //traverse tree
        System.out.println("Inorder (sorted)");
        tree.inorder();

        System.out.println("The number of nodes is: " + tree.getSize());
//        System.out.println(tree.search(5));
//        tree.deleteANode(1);
//        tree.inorder();

    }
}
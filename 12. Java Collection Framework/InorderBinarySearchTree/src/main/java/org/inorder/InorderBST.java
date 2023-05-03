package org.inorder;
/*Inorder: duyệt trung thứ tự: cây con bên trái --> root --> cây con bên phải*/
public class InorderBST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;
    public InorderBST(){
    }
    public InorderBST(E[] objects){
        for (E object : objects) insert(object);
    }
    public static class TreeNode<E> {
        protected E element;
        private TreeNode<E> left;
        private TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        InorderBST<Integer> tree = new InorderBST<>();
        tree.root = new TreeNode<>(1);
        tree.root.left = new TreeNode<>(2);
        tree.root.right = new TreeNode<>(3);
        tree.root.left.left = new TreeNode<>(4);
        tree.root.left.right = new TreeNode<>(5);

        // Function call
        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.inorder();
    }


}



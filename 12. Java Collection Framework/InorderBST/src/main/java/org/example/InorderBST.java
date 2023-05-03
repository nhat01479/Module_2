package org.example;

/*Inorder: duyệt trung thứ tự: cây con bên trái --> root --> cây con bên phải*/
public class InorderBST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public InorderBST() {
    }

    public InorderBST(E[] objects) {
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

    /* Thao tác xoá trong BST
    deleteANode gọi deleteNode
    */
    public void deleteANode(E e) {
        root = deleteNode(this.root, e);
    }
    private TreeNode<E> deleteNode(TreeNode<E> root, E e) {
        // check for node initially
        if (root == null) {
            return null;
        } else if (e.compareTo(root.element) < 0) {
            // process the left sub tree
            root.left = deleteNode(root.left, e);
        } else if (e.compareTo(root.element) > 0) {
            // process the right sub tree
            root.right = deleteNode(root.right, e);
        } else if (e.compareTo(root.element) == 0) {
            // case 3: 2 child
            if (root.left != null && root.right != null) {
                root.element = findMaxData(root.right);
                root.right = deleteNode(root.right, root.element);
                return root;
            }
            //case 2: one child
            // case i-> has only left child
            else if (root.left != null) {
                return root.left;
            }
            // case ii-> has only right child
            else if (root.right != null) {
                return root.right;
            }
            //case 1:- no child
            else {
                return null;
            }
        }
        return root;
    }
    /* Thao tác search trong BST
       deleteANode gọi deleteNode
       */
    public boolean search(E e) {
        return search(this.root, e);
    }

    private boolean search(TreeNode<E> root, E e) {
        if (root == null) {
            return false;
        } else if (root.element == e) {
            return true;
        } else if (root.element.compareTo(e) > 0) {
            return search(root.left, e);
        }
        return search(root.right, e);
    }
/*Thao tác chèn */
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

    public E findMaxData(TreeNode<E> root) {
        if (root == null) {
            return null;
        }
        // processing the right sub tree
        while (root.right != null) {
            root = root.right;
        }
        return root.element;
    }

    public E findMinData(TreeNode<E> root) {
        if (root == null) {
            return null;
        }
        // processing the left sub tree
        while (root.left != null) {
            root = root.left;
        }
        return root.element;
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



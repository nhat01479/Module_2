package org.inorder;

public interface Tree<E> {
    public boolean insert(E e);
    /**
     * Chèn phần tử e vào BST
     * Trả về true nếu thành công
     */
    public void inorder();
    /**
     * Duyệt theo thứ tự từ node gốc
     */
    public int getSize();
    /**
     * Lấy số node trên cây
     */
}

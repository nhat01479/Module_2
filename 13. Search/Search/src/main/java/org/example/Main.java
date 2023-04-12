package org.example;

public class Main {
    public static void main(String[] args) {
/* Thuật toán tìm kiếm
*
* Tìm kiếm tuần tự (tuyến tính) - Linear Search
*
*Tìm kiếm nhị phân - Binary S
*
*   Tìm kiếm nhị phân là một loại thuật toán tìm kiếm nâng cao
*   Tìm và lấy dữ liệu từ danh sách các phần tử đã được sắp xếp
*   Chia đôi dữ liệu trong danh sách cho đến khi giá trị yêu cầu được tìm thấy
*   Thường được gọi là tìm kiếm nửa khoảng hoặc tìm kiếm theo lôgarit
*   Tìm kiếm nhị phân không phù hợp với dữ liệu chưa được sắp xếp


 *
* */
    }
    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
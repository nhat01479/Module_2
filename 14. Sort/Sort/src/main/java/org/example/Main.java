package org.example;

import java.util.Arrays;

public class Main {

    /*  Thuật toán sắp xếp
     *
     * Sắp xếp nổi bọt (Bubble Sort)
     *
     * Xuất phát từ cuối dãy, đổi chỗ các cặp phần tử kế cận để đưa phần tử nhỏ hơn trong cặp phần tử đó về vị trí đầu dãy hiện hành, sau đó sẽ không xét đến nó ở bước tiếp theo
     * Ở lần xử lý thứ i có vị trí đầu dãy là i
     * Lặp lại xử lý trên cho đến khi không còn cặp phần tử nào để xét
     * https://james.codegym.vn/pluginfile.php/49160/mod_page/content/2/bubble%20sort.gif
     *
     *
     * Sắp xếp chọn (Selection Sort)
     * Chọn phần tử nhỏ nhất trong n phần tử ban đầu, đưa phần tử này về vị trí đúng là đầu dãy hiện hành
     * Xem dãy hiện hành chỉ còn n-1 phần tử của dãy ban đầu, bắt đầu từ vị trí thứ 2; lặp lại quá trình trên cho dãy hiện hành... đến khi dãy hiện hành chỉ còn 1 phần tử
     * https://james.codegym.vn/pluginfile.php/49161/mod_page/content/1/selection-sort.gif
     *
     * Sắp xếp chèn (Insertion Sort)
     *
     * Tìm cách chèn phần tử a[i] vào vị trí thích hợp của đoạn đã được sắp để có dãy mới a[0] , a[1] ,... , a[i-1] trở nên có thứ tự
     * Vị trí này chính là pos thỏa : a[pos-1] <= a[i ]< a[pos] (1 <= pos <= i)
     * https://james.codegym.vn/pluginfile.php/49162/mod_page/content/1/insert-sort.gif?time=1614047561135
     *
     *
     * Sắp xếp đổi chỗ trực tiếp (Interchange Sort)
     * */
    public static void main(String[] args) {

        int [] a = {6,1,7,8,3,4,5,2,9};
        System.out.println(Arrays.toString(a));

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
    public static void selectionSort(int[] array) {
        int minIndex; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void interchangeSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
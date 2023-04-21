package org.example;

public class TriangleClassifier {
    public static String triangleClassfier(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c<= 0) return "Khong phai tam giac";
        if (a + b <= c || a + c <= b || b + c <= a) return "Khong phai tam giac";
        else if (a == b || b == c || a == c) {
            if (a != c || b != a || b != c) return "Tam giac can";
            else return "Tam giac deu";
        }
        else return "Tam giac thuong";
    }


}

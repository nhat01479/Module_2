package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {



    @org.junit.jupiter.api.Test
    void triangleClassfier1() {
        int a = 3;
        int b = 3;
        int c = 3;
        String actual = TriangleClassifier.triangleClassfier(a,b,c);
        String excepted = "Tam giac deu";
        assertEquals(excepted,actual);
    }
    @org.junit.jupiter.api.Test
    void triangleClassfier2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String actual = TriangleClassifier.triangleClassfier(a,b,c);
        String excepted = "Tam giac thuong";
        assertEquals(excepted,actual);
    }
    @org.junit.jupiter.api.Test
    void triangleClassfier3() {
        int a = -3;
        int b = 4;
        int c = 5;
        String actual = TriangleClassifier.triangleClassfier(a,b,c);
        String excepted = "Khong phai tam giac";
        assertEquals(excepted,actual);
    }
}
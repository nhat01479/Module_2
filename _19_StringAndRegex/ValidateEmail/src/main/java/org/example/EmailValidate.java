package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    private static String REGEX;

    public static boolean validateEmail(String str) {
        /*
^
Bắt đầu chuỗi String hoặc một dòng
[A-Za-z0-9]+
Email address phải bắt đầu với “[A-Za-z0-9]+” và có ít nhất một ký tự
[A-Za-z0-9]*@
Tùy chọn theo "[A-Za-z0-9]", và kết thúc bằng một ký hiệu "@"
[A-Za-z0-9]
Domain phải sau @ và ký tự phải nằm trong [A-Za-z0-9]
\\.[A-Za-z0-9]
Sau domain là phần mở rộng của domain sau dấu chấm, ví dụ: (.com, .net, .org)
$
Kết thúc chuỗi String hoặc kết thúc dòng

        * */
        REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

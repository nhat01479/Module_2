package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static String REGEX;
    public static boolean validateAccount(String str){
        //^: Bắt đầu chuỗi regex
        // [_a-z0-9]: Ký tự cho phép dấu gạch dưới (_) chỉ là các chữ thường từ a-z hoặc 0-9
        // {6,}: Ít nhất là 6 ký tự
        // $: Kết thúc chuỗi regex
        REGEX = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

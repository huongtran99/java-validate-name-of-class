package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameOfClass {
    /*    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    Không chứa các ký tự đặc biệt
    Theo sau ký tự bắt đầu là 4 ký tự số
    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
    Ví dụ tên lớp hợp lệ: C0318G
    Ví dụ tên lớp không hợp lệ: M0318G, P0323A*/

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public NameOfClass() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

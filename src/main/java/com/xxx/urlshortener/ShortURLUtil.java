package com.xxx.urlshortener;

/**
 * Created by hanxi on 2017/5/4.
 */
public class ShortURLUtil {
    public static String idToShortURL(long n) {
        // Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        if (n == 0) {
            return "a";
        }

        StringBuffer sb = new StringBuffer();


        // Convert given integer id to a base 62 number
        while (n > 0) {
            // use above map to store actual character
            // in short url
            sb.append(map[(int) (n % 62)]);
            n = n / 62;
        }

        return sb.reverse().toString();


    }

    static int shortURLtoID(String shortURL) {
        int id = 0; // initialize result

        // A simple base conversion logic
        for (int i = 0; i < shortURL.length(); i++) {
            char c = shortURL.charAt(i);
            if ('a' <= c && c <= 'z')
                id = id * 62 + c - 'a';
            if ('A' <= c && c <= 'Z')
                id = id * 62 + c - 'A' + 26;
            if ('0' <= c && c <= '9')
                id = id * 62 + c - '0' + 52;
        }
        return id;
    }

    public static void main(String[] args) {
        System.out.println(ShortURLUtil.idToShortURL(12345));
        System.out.println(ShortURLUtil.shortURLtoID("dnh"));
    }
}

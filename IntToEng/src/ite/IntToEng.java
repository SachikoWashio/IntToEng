package ite;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
	//メインで配列用意ver.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] number = {"zero", "one", "two", "three", "four",
        		"five", "six", "seven", "eight", "nine",
        		"ten", "eleven", "twelve", "thirteen", "fourteen",
        		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String s = number[n];
        return s;
    }
}

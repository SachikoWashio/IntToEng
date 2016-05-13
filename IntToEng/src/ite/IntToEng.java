package ite;

import java.util.Scanner;

public class IntToEng {

    //メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();  
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    // 0 ~ 19までの数字と20 ~ 99までの数字で分けて処理
    static String translateEng(int n) {
    	
    	String[] num = makeZeroToNineteen();
    	String[] tenNum = makeTwentyToNinety();
    	
    	int sho = n / 10;//10の位の数字
    	int amari = n % 10;//1の位の数字
    	
    	if(sho == 0 || sho == 1) { //0から19までの処理
    		String s = num[n];
    		return s;
    		
    	} else { //20から99までの処理
    		StringBuilder sb = new StringBuilder();
    		sb.append(tenNum[sho - 2]);
    		if (amari != 0) {
    			sb.append(" "+num[amari]);
    		}
    		return new String(sb);
    	}
    }
    
    //0から19までの文字列の配列をつくる。
    static String[] makeZeroToNineteen(){
    	String str[] = {"zero", "one", "two", "three", "four",
        		"five", "six", "seven", "eight", "nine",
        		"ten", "eleven", "twelve", "thirteen", "fourteen",
        		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	return str;
    }
    
    //20から90までの10の位の文字列の配列をつくる。
    static String[] makeTwentyToNinety(){
    	String str[] = {"twenty","thirty","fourty","fifty","sixty", 
    			"sevevnty", "eighty", "ninety"};
    	
    	return str;
    }
}

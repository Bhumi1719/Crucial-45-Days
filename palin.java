package Recursion;

import java.util.*;
public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        isPalindrome(s, 0, s.length()-1);
    }

    public static void isPalindrome(String s, int p1, int p2){
        if(s.length() == 0){
            return;
        }
        if(s.charAt(p1) == s.charAt(p2)){
            System.out.println("String is palindromic");
        }else{
            System.out.println("String is not palindromic");
        }
    }
}

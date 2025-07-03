package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String name = "bob";

        for(int i =0, j = name.length()-1; i <= j; i++, j--){
            if(name.charAt(i) != name.charAt(j)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}

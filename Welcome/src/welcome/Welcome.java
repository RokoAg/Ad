/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcome;

import java.util.Scanner;

/**
 *
 * @author rakhuzhuwosapruna
 */
// This program prints Welcome to Java!
public class Welcome {
    public static void main(String[] args) {
        int sum=0;
        String [] a = new String [999];
        Scanner in = new Scanner(System.in);
        System.out.println("enter:");
        for(int i =0; i< a.length;i++){
            a[i] = in.nextLine();
        }
        
        for(int i =0; i< a.length;i++){
            sum += numberCount(a[i]);
        }
        System.out.println(sum);
    }
public static int numberCount(String a){
    String  ans;
    char f =firstno(a);
    char l =lastno(a);
    ans = String.valueOf(f) + String.valueOf(l);
    return Integer.parseInt(ans);
    }
    
public static char firstno(String a){
    
    for (char c : a.toCharArray()) {
            if (Character.isDigit(c)) {
                return c;
               
            }
        }
    throw new IllegalArgumentException("No digit found in the string");
}
public static char lastno(String a){
    
    for(int i= a.length()-1; i>= 0; i-- ){
        char c = a.charAt(i);
        if (Character.isDigit(c)) {
                return c;
                
            }
    }
    throw new IllegalArgumentException("No digit found in the string");
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String []args) {
        String s;
        System.out.println("Enter the string: ");
        s = input.nextLine();
        System.out.println("No of Words: "+wordCounter(s));
        System.out.println("No of Vowels:  "+vowelcounter(s));
        System.out.println("Number of punctuations: " + puncCount(s));
        
        String sub = "the";
        String sub1 = "The";
        if (findSubString(s, sub) || findSubString(s, sub1)) {
            System.out.println("\""+sub + "\" " + "is a part of the string.");
        } 
        else {
            System.out.println("\""+sub + "\" " + "is not a part of the string.");
        }
    }
    public static int wordCounter(String s) {
        int count = 1;
        char previous = s.charAt(0);
        for (int i = 0; i<s.length(); i++) {
            
            if (s.charAt(i) == ' ' && previous != ' ') 
                count++;
            else if (s.charAt(i) == '\n' && previous != '\n') 
                count++;
            else if (s.charAt(i) == '\t' && previous != '\t') 
                count++;
            previous = s.charAt(i);
        }
        return count;

    }
    public static int vowelcounter(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
                    s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
                    s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||
                    s.charAt(i)=='U')
            {
                count++;
            }
        }
        
        return count;
    }

    /**
     * 
     * @param s
     * @param sub
     * @return 
     */
    public static boolean findSubString(String s, String sub) {
        int subLen = sub.length();
        char firstOfSub = sub.charAt(0);
        boolean isIt = true;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == firstOfSub) {
                int temp = i;
                for (int f = 0; f<subLen && temp<s.length(); f++, temp++) {
                    if (sub.charAt(f) != s.charAt(temp)) {
                        isIt = false;
                        break;
                    }
                    else {
                        isIt = true;
                    }
                }
                if (isIt) {
                    break;
                }
            }
        }
        return isIt;
    }
    /**
     * 
     * @param s
     * @return 
     */
    public static int puncCount(String s) {
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.' || c == '?' || c == '"' || c == '"' || c == '\'' ||
                c == ',' || c == '-' || c == '_' || c == '!' || c == ':' ||
                c == ';' || c == '(' || c == ')' || c == '[' || c == ']' || 
                c == '\\') {
                count++;
            }
        }
        return count;
    }
}

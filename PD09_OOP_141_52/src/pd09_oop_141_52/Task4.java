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
public class Task4 {
    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your CNIC: ");
        String cnic=input.nextLine();
        String c=CheckGender(cnic);
        System.out.println(c);
        System.out.println(sort(cnic));
        System.out.println(reverseSentence("Abdullah Asif is my name"));
        System.out.println(center("Abdullah", 20) + 8);
        System.out.println(insert("Muhammad Asif", "Abdullah ", 9));
    }
    public static String CheckGender(String cnic){
        String male="Male";
        String female="Female";
        String gender=null;
        if(cnic.length()==13)
        {
            if(cnic.charAt(12)=='1' ||cnic.charAt(12)=='3'||cnic.charAt(12)=='5'
                    ||cnic.charAt(12)=='7'||cnic.charAt(12)=='9')
            {
                gender=male;
            }
            else{
                gender=female;
            }
        }
        return gender;
    }
    public static String sort(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        char temp;
        for (int i = 0; i<len; i++) {
            for (int f = i; f<len; f++) {
                if (arr[i] > arr[f]) {
                    temp = arr[i];
                    arr[i] = arr[f];
                    arr[f] = temp;
                }
            }
        }
        return new String(arr);
    }
    public static String reverse(String s) {
        String string = new String();
        for (int i = (s.length()-1); i>=0; i--) {
            string += s.charAt(i);
        }
        return string;
    }
    public static String reverseSentence(String s) {
        String string = "";
        String word = "";
        char c;
        for (int i = 0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c != ' ') {
                word = word + c;
            }
            else {
                string = word + c + string;
                word = "";
            }
        }
        string = word + ' ' + string;
        return string;
    }
    public static String center(String s, int fieldWidth) {
        int len = s.length();
        int spaces = fieldWidth - len;
        if (spaces<=0) {
            return s;
        }
        String string = "";
        for (int i = 0; i<spaces/2; i++) {
            string += ' ';
        }
        string += s;
        for (int i = 0; i<spaces/2; i++) {
            string += ' ';
        }
        return string;
    }
    
    public static String insert(String s, String toInsert, int index) {
        int len = s.length();
        String string = "";
        if (index>=len) {
            return s;
        }
        for (int i = 0; i<index; i++) {
            string += s.charAt(i);
        }
        string += toInsert;
        for (int i = index; i<len; i++) {
            string += s.charAt(i);
        }
        return string;
    }
    
}

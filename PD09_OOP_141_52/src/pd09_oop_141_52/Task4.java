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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

/**
 *
 * @author Hp
 */
public class Task1 {

    public static void main(String []args) {
        String s = "Hello. this is uet Lahore";
        System.out.println("No of Words= "+wordCounter(s));
        System.out.println("No of Vowels= "+vowelcounter(s));
    }
    public static int wordCounter(String s) {
        int count = 0;
        char previous = s.charAt(0);
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == ' ' && previous != ' ') 
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
                for (int f = 0; f<subLen; f++, temp++) {
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
        return 1;
    }
}

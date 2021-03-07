import java.io.*;
import java.util.*;
import java.math.*;

public class Gemstone{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String [] string=new String[n];
        int j;
        int gemEle=0;
        char c;
        boolean found=false;
        String rdup = "";
        
        for(int i=0;i<n;i++)
        {
            string[i]=s.next();            
        }
        int len=string[0].length();
        for (int i = 0; i< len; i++) {
               int count = 1;
               for (int k = i+1; k < len; k++) {
                   if (string[0].charAt(i) == string[0].charAt(k)) {
                        count++;
                   }
               }
               if (count == 1){
                   rdup += string[0].charAt(i);
               }
        } 
        
        for(int i=0;i<rdup.length();i++)
        {
            j=1;
            c=rdup.charAt(i);
            find:
            while(j<n){
                if(string[j].indexOf(c)!=-1)
                    found=true;
                else{
                    found=false;
                    break find;
                }
                j++;
            }
            if(found)gemEle++;
        }
        System.out.println(gemEle);
    }
}
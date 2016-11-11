import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String out = "";
        // for(int i=1;i<input.length();i++){
        //     System.out.println("char at i-1 is "+(i-1)+") "+input.charAt(i-1)+"  and at i is "+i+") "+input.charAt(i));
        //     if(input.charAt(i)!=input.charAt(i-1)){
        //         out += input.charAt(i);
        //     }
        //     else{
        //         i++;
        //     }
        // }
        int i=0;
        while(i<input.length()-1){
            if(input.charAt(i)==input.charAt(i+1)){

            }
            else{
                out+=input.charAt(i);
            }
            i++;
        }
        System.out.println(out);
    }
}

 if(n==0){
        return head.data;
    }
    else{
        Node tmp = head;
        Node prv = null;
        for(int i=0;i<n;i++){
            prv = tmp;
            tmp = tmp.next;
        }
        return prv.data;
    }
    
package dsa_java_sharvesh;

import java.util.Scanner;

/*Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings.
*/
public class StringArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String arr[]= new String[size];
        int sumsize=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            sumsize+=arr[i].length();
        }
        System.out.println(sumsize);
    }
}

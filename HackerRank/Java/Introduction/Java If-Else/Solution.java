// Java If-Else
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2 != 0) {
            System.out.println("Weird");
        } else if(n <= 5) {
            System.out.println("Not Weird");
        } else if(n <= 20) {
            System.out.println("Weird");
        } else if(n > 20) {
            System.out.println("Not Weird");
        }
    } 
}
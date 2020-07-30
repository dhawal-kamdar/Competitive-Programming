// Java Static Initializer Block
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B;
static int H;
static boolean flag;
static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    flag = false;
    try {
        if(B > 0 && H > 0) {
            flag = true;
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    } catch(Exception e) {
        System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


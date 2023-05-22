package Pattern;
import java.util.Scanner;

public class HollowRectanglePattern {
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = scn.nextInt();
    Scanner scm = new Scanner(System.in);
    System.out.println("enter value of m");
    int m = scm.nextInt();
    for (int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            if (i == 1 || j == 1 || i == n || j ==m ) {
                System.out.print("*");
            }
            else {
            System.out.print(" ");
            }
        }    
        System.out.println();
    }
    scn.close();
    scm.close();
 }   
}


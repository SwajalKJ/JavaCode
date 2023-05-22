package Pattern;
import java.util.Scanner;

public class SolidRectanglePattern {
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = scn.nextInt();
    Scanner scm = new Scanner(System.in);
    System.out.println("enter value of m");
    int m = scm.nextInt();
    for (int i=1;i<=n;i++){
        for (int j=1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    scn.close();
    scm.close();
 }   
}

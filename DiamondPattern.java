package Pattern;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
    System.out.println("enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

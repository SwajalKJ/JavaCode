package Functions;
import java.util.Scanner;   
public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int calculateMultiply(int a,int b){
        int product = a*b;
        return product;
    }

    public static void factorialNum(int n){
        int factorial = 1;
        for( int i=n ; i>=1 ; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter your name");
        //String name = sc.nextLine();
        //printMyName("your name is" + " " + name);
        //sc.close();


        //Scanner valueA = new Scanner(System.in);
        //System.out.println("enter value of a");
        //int a = valueA.nextInt();
        //Scanner valueB = new Scanner(System.in);
        //System.out.println("enter value of a");
        //int b = valueB.nextInt();
        //int sum = calculateSum(a, b);
        //System.out.println("sum of 2 no." + " " + sum);
        //int product = calculateMultiply(a, b);
        //System.out.println("product of 2 no." + " " + product);
        //valueA.close();
        //valueB.close();

        Scanner valueN = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = valueN.nextInt();
        factorialNum(n);
        valueN.close();
    }
}

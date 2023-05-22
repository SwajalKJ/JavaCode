package ClassWork;
import java.util.Scanner;
class LimitedSetLoop {

static void printSet(char[] X, int k)
{
	int n = X.length;
	printSetString(X, " ", n, k);
}//by swajal
static void printSetString(char[] X,String prefix,int n, int k)
{

	if (k == 0)
	{
		System.out.println(prefix);
		return;
	}

	for (int i = 0; i < n; ++i)
	{

		String newPrefix = prefix + X[i];

		printSetString(X, newPrefix, n, k - 1);
	}
}//by swajal
public static void main(String[] args)
{
	Scanner valueK = new Scanner(System.in);
    System.out.println("Enter value to length k");
    int k = valueK.nextInt();
    char[] X = {'a', 'b'};
    printSet(X, k);
	System.out.println(" ");
	//by swajal
	valueK.close();
}
}
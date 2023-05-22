package ClassWork;
class infiniteSetLoop {

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
	System.out.println("SETS FROM 1 to 15");
    System.out.println(" ");
	char[] X = {'a', 'b'};
	for (int k = 1; k <=15; k++) {
	    printSet(X, k);
	    System.out.println(" ");
	}//by swajal
}
}
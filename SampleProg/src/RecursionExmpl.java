//Working of recursion method

class Factorial{
	
	int fact(int n) 
	{
		int r=0;
		if(n==1) { 
			System.out.println("In IF");
			//System.out.println("Value of Res: "+res);
			return 1;
		}
		System.out.println("Value of N: "+n);
		//System.out.println("Value of Res: "+r);
		r = fact(n-1)*n;
		System.out.println("Value of Res: "+r);
		System.out.println("Value of N..................: "+n);
		return r;
	
	}
}

public class RecursionExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int res=0;
       Factorial f = new Factorial();
       System.out.println("Fact of N: "+f.fact(6));
	}

}

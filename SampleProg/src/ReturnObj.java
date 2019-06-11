//Working of returning Object

class Test{
	int a;
	Test(int a){
		this.a = a;
	}
	
	Test methRetObj() 
	{
		System.out.println("In methRetObj = "+a);
		Test obj1 = new Test(a+10);
		return obj1;
		
	}
	
}

public class ReturnObj {
	public static void main(String[] args) 
	{
		Test t2;
		Test t1 = new Test(2);
		t2=t1;
		System.out.println("Before Object t1 = "+t1.a);
		System.out.println("Before Object t2= "+t2.a);
		t2 = t1.methRetObj();
		System.out.println("After methRetObj t1 = "+t1.a);
		System.out.println("After methRetObj t2 = "+t2.a);
		t2 = t2.methRetObj();
		System.out.println("After methRetObj t2 = "+t2.a);
	}
	

}

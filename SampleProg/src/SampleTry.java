/**
 * 
 */

/**
 * @author Akash
 *  Sample Programs to try basic execution of Java
 */

 class Sample{
	 int a,b;
	 String str;
	 void SetValue(int a,int b) 
	 {
	    this.a = a;
	    this.b = b;
	 }
	 
	 public String toString() {
		 return a+".."+str;
	 }
 } 
public class SampleTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample var1 = new Sample();
		Sample var2 = new Sample();
		var1.SetValue(10, 20);
		//System.out.println("A= "+var1.a +"  B= "+var1.b);
		System.out.println("Str= "+var1.str);
		System.out.println("A= "+var2.a);
		System.out.println("B= "+var2.b);
		
		System.out.println(var1);
		System.out.println(var2);
		
//		System.out.println(var2.hashCode());
		
	

	}

}





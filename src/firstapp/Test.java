package firstapp;

public class Test {

public Test(){
		this(10);
	System.out.println("no-arg");
	}
	public Test(int i){
		this(10.5);
		System.out.println("int-arg");
	}
	public Test(double d){
		//this(10.5);
		System.out.println("double arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
	Test t2=new Test(10); 
	}

}

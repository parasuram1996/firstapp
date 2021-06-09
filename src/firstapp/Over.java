package firstapp;

public class Over {
public Over() {
	this(10);
	System.out.println("no-arg");
}
public Over(int i) {
	this(10.6);
System.out.println("int-arg");
}
public Over(double d) {
	System.out.println("double-arg");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Over o=new Over();
	}

}

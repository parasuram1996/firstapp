package firstapp;

public class Student {

int sid;
String sname;
float ssal;

public Student(int sid,String sname,float ssal)
{
	this.sid=sid;
	this.sname=sname;
	this.ssal=ssal;

}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(101,"parasuram",2000);
System.out.println(s1.sid+"---"+s1.sname+"---"+s1.ssal);

Student s2=new Student(102,"parasuram",1000);
System.out.println("========================");
System.out.println(s2.sid+"---"+s2.sname+"---"+s2.ssal);

	}

}

package OopsConcept;

public class Car {
 int wheel;
 int mod;
/* public int as() {
	int  x=10;
	int  y=20;
	int z= x+y;
	return z;
 }*/
 public String as() {
		String d="ABC";
		return d;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c= new Car();//c is object reference variable 
c.wheel=45;
System.out.println(c.as());
System.out.println(c.wheel);

	}

}

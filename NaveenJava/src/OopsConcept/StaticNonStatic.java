package OopsConcept;

public class StaticNonStatic {
 String name="Tom";
 static int age=25;
 
 public void sendM() {
	 System.out.println("non static");
 }
 public static void sum() {
	 System.out.println("static");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
StaticNonStatic.sum();
System.out.println(age);
System.out.println(StaticNonStatic.age);
StaticNonStatic obj =new StaticNonStatic();
System.out.println(obj.name);
obj.sendM();
obj.sum();

	}

}

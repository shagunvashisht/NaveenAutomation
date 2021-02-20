package tesingjava;

class test {
	 int s=40;
	 public void test1(){
		 System.out.println("hi");
		 s=10;
	 }
}
 class d extends test {
	// d(){
		 //super();
	//	 super();//constructor call must be first statement
		// System.out.println("bye");
//	 }
	public void m() {
		 s=20;
	}
 }

 class sts{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 d t= new d();//why output  of child class
		
//d D=new d();
	 System.out.println(t.s);
	 t.test1();
	}

 }

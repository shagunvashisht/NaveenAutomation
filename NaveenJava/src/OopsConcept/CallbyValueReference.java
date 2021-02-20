package OopsConcept;

public class CallbyValueReference {
	int p;
	int q;
public int testSum(int a, int b) {
	a=50;
	b=40;
	int c=a+b;//final values will be taken while adding
return c;
}
public void swap(CallbyValueReference t) {
	int temp;
	temp=t.p;
	t.p=t.q;
	t.q=temp;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValueReference obj=new CallbyValueReference();
		int x=20;
		int y=30;
		obj.testSum(x,y);//call by value;value passed through copy of arguments
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p+ "value of p");
		System.out.println(obj.q);
	    
	}

}

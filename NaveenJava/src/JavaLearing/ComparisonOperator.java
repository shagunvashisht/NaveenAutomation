package JavaLearing;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=400;
 int b=300;
 int c=30;
 //to calculate greatest number use nested if else 
 if((a>b) & (a>c)) {// result of this tells a is smaller than b and c
	 System.out.println("a is greater");
 }
	 else if(b>c) { //so next condition should contain the comparison of b and c only
		 System.out.println("b is greater");}
	 else{
			 System.out.println("c is greater");
		 }
	 }
	 
 }
	


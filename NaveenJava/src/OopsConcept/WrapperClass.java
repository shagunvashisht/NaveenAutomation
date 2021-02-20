package OopsConcept;

public class WrapperClass {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String x="100";
		 System.out.println(x+20);//string concatenation
		
		  //to convert string into int we have to use wrapperclass
		int i= Integer.parseInt(x);//Integer is wrapper class & pareseint is a method
		System.out.println(i+20);
		 //we have different wrapper class for data conversion Integer,Double,Boolean
		//string to double conversion
		String y="12.33";
Double d=Double.parseDouble(y);
		System.out.println(d+10);
		String a="true";
		Boolean b=Boolean.parseBoolean(a);
		System.out.println(b);
		
		int dg=200;
		String bl=String.valueOf(dg);
		System.out.println(bl+200);//string concat 
		String j="100A";
	int yu=	Integer.parseInt(j);	
	System.out.println(yu);//will give numberformat exception since string is alphanumberic.
	
	}

}

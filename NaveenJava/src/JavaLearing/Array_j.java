package JavaLearing;

public class Array_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]=new int[4];
i[0]=10; //lower bound or index=0
i[1]=20;
i[2]=30;
i[3]=40;//upper bound=n-1 (n is the size of array)
//System.out.println(i[4]);//array index bound array will be thrown as upper bound can not be equal to size of array
//System.out.println(i[4]);
//to find size of array
System.out.println(i.length);

//to print all the index values of array we will use for loop
for(int j=0;j<i.length;j++) {
	System.out.println(i[j]);
	//System.out.println(i[2]);
}
 double d[]= new double[3];
 d[0]=10;
 d[1]=20.55;
 System.out.println(d[0]);
 
 char c[]= new char[3];
 c[0]=10;
 c[1]='$';//special char
 c[2]='a';
 System.out.println(c[2]);
 
boolean b[]= new boolean[2];
b[0]=true;
b[1]=false;
System.out.println(b[1]);

String s[]= new String[4];
s[0]="apple";
s[1]="catfish";
System.out.println(s[1]);

Object ob[]=new Object[5];
ob[0]="TOM";
ob[1]='A';
ob[2]=12.45;
ob[3]="11/4/1885"; //date format with type string
System.out.println(ob[3]);
System.out.println(ob.length);
for( int l=0; l<ob.length;l++)
{
	System.out.println(ob[l]);
}

	}

}

package JavaLearing;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[][]= new int[2][3];
 System.out.println("no. of rows"+ a.length);// no of rows
 System.out.println("no of columns" + a[0].length);//no of columns
 a[0][0]=10;
 a[0][1]=20;
 a[0][2]=30;
 a[1][0]=40;
 a[1][1]=50;
 a[1][2]=60;
 System.out.println("Two Dimensional Array");
 for(int row=0;row<a.length;row++) {
	 for(int col=0;col<a[row].length;col++)
	 {
		 System.out.print(a[row][col] + " ");
	 }
	 System.out.println();
 }
 
	}

}

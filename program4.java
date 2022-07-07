import java.util.*;
public class program4{
	public static void print(int a, int b, int array1[][]){
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
				System.out.print(array1[i][j]+" ");
}
		System.out.println();
}
}
	public static void main(String[] args){
		int array[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array:");
		for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			array[i][j]=sc.nextInt();
}}
		System.out.println("Original array:");
		print(2,3,array);

		int array1[][]=new int[3][2];
		for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
				array1[i][j]=array[j][i];
}}
		System.out.println("After changing rows and columns of the array:");
		print(3,2,array1);

}
}
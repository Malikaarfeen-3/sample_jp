import java.util.*;
public class program5{
	public static void print(int a, int array1[]){
	for(int i=0;i<a;i++){
				System.out.print(array1[i]+" ");
}
}
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array:");
		int n=sc.nextInt();
		System.out.print("Enter the array:");
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
}
		System.out.println("Original array:");
		print(n,array);
		int temp;
		for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
				if(array[j]<array[j+1]){
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;}
}}
		System.out.println();
		System.out.println("3 large numbers:");
		print(3,array);

}
}
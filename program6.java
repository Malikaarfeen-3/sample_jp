import java.util.*;
public class program6{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input number:");
		int n=sc.nextInt();
		int ans, r;
		String str="";
		int count=0;
		
		while(n>0){
			r=n%2;
			
			if(r==0)
				{
				count++;
				str+='0';
			}else
			str+='1';
			n=n/2;
}
		char c[]=str.toCharArray();
		System.out.print("Binary representation is:");
		for(int i=c.length-1;i>=0;i--)
			System.out.print(c[i]);
		System.out.println();
		System.out.println("Number of zero bits: "+count);
}
}
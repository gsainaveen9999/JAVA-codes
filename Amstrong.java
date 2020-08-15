import java.util.*;
class Amstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ams=n;
		int b,c=0;
		while(ams>0){
          b=ams%10;
          ams=ams/10;
          c=c+(b*b*b);
		}
		if(n==c){
			System.out.println("Amstrong Number");
		}else{
			System.out.println("Not an Amstrong Number");
		}
		
}}
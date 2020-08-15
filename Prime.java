import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  if(a==2){
		  	System.out.println("is a prime number");
		  }else if(a>0){
		  for(int i=2;i<a;i++){
		  	if(a%i==0){
		  		System.out.println("it is  not prime number");
		  		break;
		  	}
		  }
	}
		System.out.println("IT is  prime number ");
	}
}
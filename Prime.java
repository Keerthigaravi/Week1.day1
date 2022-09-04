package day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int count=0;
		for(int i=2; i<=num-1;i++) {
			if(num%i==0) 
				count++;
		}	
		
		if(count==0) 
		System.out.println("Prime");
		else
		System.out.println("not Prime");
		
		}}

	

package week1.myassignments;

import java.util.Iterator;

public class FibonacciSeries {

		
		public static void main(String[] args) {
			
			int n=8,f1=0,f2=1;
			
			System.out.println("Fibbonacci Series of " + n + " numbers");
			
			for (int i=1 ;i<=n;++i) 
			{
				
				System.out.println(f1+ ",");
				int sum=f1+f2;
				f1=f2;
				f2=sum;
				
				
			
			
			}
			
			
		}


}

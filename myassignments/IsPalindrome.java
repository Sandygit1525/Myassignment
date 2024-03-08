package week1.myassignments;

public class IsPalindrome {
	
	public static void main(String[] args) {	
	
	{
		int t,i,r;
	    int n = 313;
	    t=n;
	    for(i=0;n>0;n/=10)
	    	
	    {
	    r=n%10;
	    i=(i*10)+r;
	    }
	    
	   if(i==t)
	   {
		System.out.println(t+" is a palindrome number ");
	   }
        else
        {
		System.out.println(t+" is not a palindrome number ");
	   }         
	}

}
}



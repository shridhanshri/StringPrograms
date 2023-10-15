

/*
 * 1. Check length of a string is equal to the number appended at its last

Input:  str = "geeks5"
Output:  Yes
Explanation : As geeks is of 5 length and at 
              last number is also 5.

Input:  str = "geeksforgeeks15"
Output:  No
Explanation: As geeksforgeeks is of 13 length and
             at last number is 15 i.e. not equal
 */

package pracjava;

public class StringEqualToNumberAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "geeks5";
		
		System.out.println("String  = "+s);
		
		char a[] = s.toCharArray();
		int c=0, i,j;
		 int  totalc = s.length();
		 
		 int charlast= s.length()-1;
		 
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=1 && a[i]<=100)
			{
				c++;
			}
		}
		//System.out.println("Count = "+c);
	
		if(charlast == totalc -c )
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}



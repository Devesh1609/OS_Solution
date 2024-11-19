import java.util.*;

public class Question2 {
	public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the marks");
	int n = sc.nextInt();
	if(n>=90)
	{
		System.out.println("EXCELLENT");
		
	}
	else if(n>=60 && n<90)
	{
		System.out.println("GOOD");
	}
	else 
	{
		System.out.println("AVERAGE");
	}
		
	}

}
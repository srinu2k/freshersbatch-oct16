import java.util.Scanner;

public class StudentMarks 
{
	
	public static void main(String[] args)
	{
		int[][] student= new int[3][3];
		int total=0;
		
	    Scanner myObj = new Scanner(System.in);
	    
		for (int i = 0; i < student.length; i++) 
	    {
		  System.out.println("Fill the marks of student"+i+ " for subjects A ,B ,C :");
	      for(int j = 0; j < student.length; j++) 
	      {
	        student[i][j]= myObj.nextInt();
	        total= total+ student[i][j];
	      }
	      System.out.println("\nTotal marks of Student"+i+"="+total);
	      int avg = total/3;
	      System.out.println("Average marks of Student"+i+"="+avg);
	    }
		int total1 =0;
		for(int j = 0; j < student.length; j++)
		{
			for (int i = 0; i < student.length; i++) 
			{
				total1 = total1 +student[i][j];
			}
			System.out.println("\nTotal marks for subject "+j+"is "+total1);
			int avg1 =total1/3;
			System.out.println("Average marks of Subject"+j+"is"+avg1);
		}
	}
}

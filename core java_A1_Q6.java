import java.util.Scanner;
public class CUI 
{
	public static void main(String[] args)
	{
		int k=0;
		String id,password;
		id="USER345";
		password="Hi@2312&";
		for(int i=0; i<3;i++)
		{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter user-ID:");
		String id1= in.nextLine();
		System.out.println("Enter password:");
		String password1= in.nextLine();
		if(id1==id && password==password1)
		{
			System.out.println("Welcome"+id1);
		}
		else
		{
			System.out.println("INVALID CREDENTIALS");
			k=k+1;
		}
		}
		
		if(k==3)
		{
			System.out.println("Contact Admin");
		}
		
	}

}

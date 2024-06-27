package server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Members> l2 = new ArrayList();
		List<Bugs> l1 = new ArrayList();
		int choice;
		do
		{
			System.out.println("****************************");
			System.out.println("eneter 0 to exit");
			System.out.println("eneter 1 insert a bug");
			System.out.println("enter 6 display members");
			
			System.out.println("****************************");	
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				try {
					Dao d=new Dao();
					
					System.out.println("Enter title: ");
					String title=sc.next();
					System.out.println("Enter description: ");
					String description=sc.next();
					System.out.println("Enter status: ");
					String status=sc.next();
					System.out.println("Enter assigned to: ");
					int assignTo=sc.nextInt();
					Bugs b= new Bugs(title,description,status,assignTo);
					d.insertBugs(b);
					

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					Dao d1= new Dao();
					l2=d1.getAllMembers();
					for(Members m: l2)
					{
						System.out.println(m.toString());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		while(choice!=0);
	}

}

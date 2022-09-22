package j12collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class stud
{
	private int sno;
	private String sname;
	private int hindi;
	private int english;	

public void setData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter number=>");
	sno=sc.nextInt();
	
	System.out.print("Enter sname=>");
	sname=sc.next();
	
	System.out.print("Enter hindi marks=>");
	hindi=sc.nextInt();
	
	System.out.print("Enter english marks=>");
	english=sc.nextInt();
}
public void printData()
{
	System.out.println("sno= "+sno+"sname="+sname);
}
public int total()
{
	return(hindi+english);
}
}
public class student {

	public static void main(String[] args) {
		
		ArrayList<stud> list=new ArrayList<stud>();
		stud s1;
		int n=1;
		for(int i=0;i<n;i++)
		{
			s1=new stud();
			s1.setData();
			list.add(s1);
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			s1=(stud)(itr.next());
			if(s1.total()<35)
			{
				System.out.println("fail");
			}
			else 
			{
				System.out.println("pass");
			}
		}
	}
}


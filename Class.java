package ssss;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		String s="malayalam";
		char aa[]=s.toCharArray();
		char a11[]=s.toCharArray();
		for(int i=0;i<aa.length;i++)
		{
			for(int j=i+1;j<aa.length;j++)
			{
				if(aa[i]==a11[j])
				{
					
					a11[j]='@';
				}
			}
		}
		int count=0;
		for(int i=0;i<aa.length;i++)
		{
			if(a11[i]!='@')
			{
				System.out.print(a11[i]);
				
		}
		
    }

	}
}
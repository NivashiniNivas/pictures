import java.util.*;
public class qc1
	{
public static void main(String args[]) 
	{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements:");
n=in.nextInt();
System.out.println("Enter the elements:");
int a[]=new int[n];
for(int i=0;i<n;i++)
   {
a[i]=in.nextInt();
   }
ArrayList al=new ArrayList();
for(int i=0;i<n;i++)
   {
al.add(a[i]);
   }
Iterator itr=al.iterator();
while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element);
      }
Set<Integer> set = new HashSet<Integer>(al);

        System.out.println("Set values .....");
        for (Integer temp : set){
        	System.out.println(temp);
	}
	}
}
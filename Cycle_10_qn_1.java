/**Write a Java program for the following:
a. Create a doubly linked list of elements.
b. Delete a given element from the above list.**/

import java.util.*;

class Cycle_10_qn_1
{
	Scanner obj=new Scanner(System.in);

	class Node
    {
	 	int data;
	 	Node prev;
	 	Node next;
	}

	Cycle_10_qn_1()
    {
		System.out.print("Enter no.of nodes:");
		int n =obj.nextInt();
		System.out.print("Enter numbers:");
		Node h= new Node();
		Node n1 = h;
		n1.prev=null;
		for(int i=0;i<n;i++)
        {
		    Node temp=n1;
			n1.data = obj.nextInt();
			n1.next=new Node();
			n1=n1.next;
			n1.prev=temp;
		}
		n1.next=null;
		System.out.print("Do you want to delete a node?(1 for Yes/0 for No)");
		int a =obj.nextInt();
		if(a==1)
        {
			System.out.print("Enter number to be deleted:");
			int c=obj.nextInt();
			if(h==null)
				System.out.println("List is empty");

			else if(h.data==c)
            {
                Node temp=h;
                h=h.next;
                temp.next=null;
                n=n-1;
			}
			else
            {
				Node crnt=h; 
				while(crnt!=null && crnt.data!=c)
					crnt=crnt.next;
				crnt.prev.next=crnt.next;
				crnt.next.prev=crnt.prev;
				crnt.prev=null;
				crnt.next=null;
				n=n-1;
			}	
		}
		System.out.print("NUMBERS IN LIST ARE:");
		Node temp=h;
		for(int i=0;i<n;i++)
        {
			System.out.print(temp.data+" ");
			temp=temp.next; 
		}
	}
	public static void main(String args[])
    {
		new Cycle_10_qn_1();
	}
}
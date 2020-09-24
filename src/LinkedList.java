import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner; 

// Basic Linked List that is populated by random integers 
// got arraylist to work but need to work on search
class linkedList {

	Node head;
	public static boolean search(Node head, int x){
		Node current = head;
		while (current != null){
			if(current.data == x){
				return true;
				
			}
			current = current.next;
		}
		
		return false;
	}
	
	public static void main(String args[]) {

		//Creates a new Linked List names newLinked List
		LinkedList<Integer> newLinkedList = new LinkedList<>();
		
		System.out.print("Enter Searching number: ");
		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt(); 
		System.out.println("You entered: " + number);

        Random r = new Random();
		for (int i = 1; i <= 10; i++) {
			newLinkedList.add(r.nextInt(50));
			
		}
		
		System.out.println("Linked List: " + newLinkedList);
		System.out.println("Size of Linked List: " + newLinkedList.size());

	}

}

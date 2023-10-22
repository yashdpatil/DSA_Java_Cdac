class Doubly_LL{
Node head;
	class Node{
	int data;
	Node Next;
	Node prev;
		Node(int data){
		this.data = data;
		Next = null;
		prev = null;
		}
}

void insert(int data){
	Node n1 = new Node(data);
	n1.Next = head;
	n1.prev = null;
	if(head!=null){
	head.prev = n1;}
	head = n1; 
}
	

		void Display(){
			Node p = null;
			Node n = head;
			while(n!=null){
				System.out.print(n.data+"- >");
				
				p=n;
				n=n.Next;
			}
System.out.println();
			System.out.println("Reversed");
			while(p!=null){
				System.out.print(p.data+" - > ");
				p=p.prev;
			}


			}			
		
	
public static void main(String args[]){
Doubly_LL ll = new Doubly_LL();
ll.insert(10);
ll.insert(20);
ll.insert(30);
ll.insert(40);
ll.append(50);
ll.Display();

}
}

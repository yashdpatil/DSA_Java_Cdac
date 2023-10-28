class queue_LL{
	Node rear;
	Node front;
	int length =0;
	
		queue_LL(){
			this.rear =null;
			this.front =null;
		}
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next=null;
			
		}
	
	}
	boolean isEmpty(){
		return length==0;
	}
	
		boolean Enque(int data){
			Node temp = new Node(data);
			if(isEmpty()){
				front=temp;
			}
			else{
				rear.next=temp;
			}
			rear = temp;
			length++;
			return true;
		}
	
		int Dequeue(){
			int result = front.data;
			front = front.next;
			while(front==null){
				rear =null;
			}
			length--;
			return result;
		}
		void Display(){
	while(front!=null){
		System.out.print( front.data+" ");
		front=front.next;
	}
		}

	


public static void main(String args[]){
queue_LL q = new queue_LL();
q.Enque(10);
q.Enque(20);
q.Dequeue();
q.Display();
}
}

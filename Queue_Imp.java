/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int Max=100;
    int arr[] = new int[Max];
    int front;
    int rear;
    Main(){
        front=-1;
        rear=-1;
    }
    Boolean AddElement(int data){
        if(rear==Max-1){
            System.out.println("Out of size");
        }
        arr[++rear]=data;
        return true;
    }
 
    Boolean Deque() {
        if (front < Max - 1) {
            int data = arr[++front];
            System.out.println(data + " Deleted !!!");
            if (front > rear) {
                front = -1;
                rear = -1;
            }
            return true;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return false;
        }
    }
    void Display(){
        for(int i =front;i<rear;i++){
          System.out.print(" "+  arr[i]);;
            
        }
    }
    
	public static void main(String[] args) {
		Main m= new Main();
		m.AddElement(10);
		m.AddElement(20);
		m.AddElement(41);
		m.AddElement(50);
		m.Deque();
		m.Display();
	}
}


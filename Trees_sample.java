public class Binary_Tree{
				Node root;
			Binary_Tree(){
				root =null;
			}
			Binary_Tree(int d){
				root = new Node(d);
			}
	public static class Node{
		int Data;
		Node Left,Right;
	
	Node(int Data){
		this.Data=Data;
		Left=Right=null;
	}
	}
			void PrintInorder(Node root){
			if(root==null)
				return;
			PrintInorder(root.Left);
			System.out.print(root.Data+" ");
			PrintInorder(root.Right);
			}
			
			
			void PrintPreorder(Node root){
					
			if(root==null)
				return;
			System.out.println(" ");
			System.out.print(root.Data+" ");
			PrintInorder(root.Left);
			PrintInorder(root.Right);
			}
			
			
			void PrintPostorder(Node root){
					
			if(root==null)
				return;
			System.out.println(" ");
			PrintInorder(root.Right);
			PrintInorder(root.Left);
			System.out.print(root.Data+" ");
			}
			
				void InPrnt(){
				PrintInorder(root);
				}

				void prePrnt(){
				PrintPreorder(root);
				}

				void prePost(){
					PrintPostorder(root);
				}

	
			
			
public static void main(String args[]){
	Binary_Tree b1 = new Binary_Tree();
	b1.root= new Node(10);
	b1.root.Left = new Node(11);
	b1.root.Right = new Node(12);
	b1.root.Left.Left=new Node(13);
	b1.root.Right.Right = new Node(14);
	b1.InPrnt();
	b1.prePrnt();
	b1.prePost();
}
}



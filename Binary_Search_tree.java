import java.util.*;

class Binary_Search_tree {
	Node root;

	Binary_Search_tree() {
		root = null;
	}

	Binary_Search_tree(int data) {
		root = new Node(data);
	}

	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	void preOrder() {
		preOrder(root);
	}

	Node Insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key <= root.data) {
			root.left = Insert(root.left, key);
		} else {
			root.right = Insert(root.right, key);
		}
		return root;
	}

	void Insert(int key) {
		root = Insert(root, key);
	}

	Node Deletion(Node root, int key) {
		if (root == null) {
			return root;
		}
		if (root.data > key) {
			root.left = Deletion(root.left, key);

		} else if (root.data < key) {
			root.right = Deletion(root.right, key);
		} else {
			if (root.left == null)
				return root.right;
			else if (root.right == null) {
				return root.left;
			}
			root.data = Minvalue(root.right);
			root.right = Deletion(root.right, root.data);

		}
		return root;
	}

	int Minvalue(Node root) {
		int x = root.data;
		while (root.left != null) {
			x = root.left.data;
			root = root.left;
		}
		return x;
	}

	void Deletion(int key) {
		root = Deletion(root, key);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Binary_Search_tree bt2 = new Binary_Search_tree();
		// bt2.root = new Node(11);
		for (int i = 0; i < 8; i++) {
			int n = sc.nextInt();
			bt2.Insert(n);
		}
		bt2.Deletion(20);

		bt2.preOrder();

	}
}

class Stack {
	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];

	Stack() {
		top = -1;

	}

	boolean isEmpty() {
		return top < 0;
	}

	boolean isFull() {
		return (top == (MAX - 1));
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("OverFlow");
			return false;
		} else {
			a[++top] = x;
			// System.out.println("Push");
			return true;
		}
	}

	boolean pop() {
		if (top < 0) {
			System.out.println("UnderFLow");
			return false;
		} else {
			int x = a[top--];
			System.out.println(x);
			return true;
		}
	}

	int peek() {
		// If stack is empty
		if (top < 0) {
			System.out.println(
					"Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	static void DisplayStack(Stack s) {
		// Create another stack
		Stack s1 = new Stack();

		// Until stack is empty
		while (!s.isEmpty()) {
			s1.push(s.peek());

			// Print the element
			System.out.print(s1.peek()
					+ " ");
			s.pop();
		}
	}

	public static void main(String args[]) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		// System.out.println(st.peek());
		st.DisplayStack(st);

	}
}

package V13012015;

public class BinarySearch {

	private Node root;

	public BinarySearch() {
		root = null;
	}

	public void add(int value) {

		if (root == null) {
			root = new Node(value);

		} else {
			add(root, value);
		}
	}

	private void add(Node current, int value) {
		if (current == null) {
			current = new Node(value);
			return;
		}// ovaj if ne radi NE MOŽE OVAKO!!!!!

		if (value <= current.getValue()) {
			if (current.left == null) {
				current.left = new Node(value);
				return;
			}
			add(current.left, value);
		}

		else {
			if (current.right == null) {
				current.right = new Node(value);
				return;
			}
			add(current.right, value);
		}

	}

	public void printRoot() {
		printRoot(root);
	}

	private void printRoot(Node root) {
		if (root == null) {
			return;
		} else {

			printRoot(root.left);
			System.out.println(root.value);
			printRoot(root.right);
		}
	}

	public boolean containes(int value) {

		if (root == null) {
			throw new IllegalArgumentException("Root is empty");
		}
		return containes(root, value);
	}

	private boolean containes(Node current, int value) {
		if (current.getValue() == value) {
			return true;
		} else if (value < current.getValue()) {
			if (current.getLeft() == null) {
				return false;
			}
			return containes(current.getLeft(), value);
		} else {
			if (current.getRight() == null) {
				return false;
			}
			return containes(current.getRight(), value);
		}
	}

	public class Node {

		private int value;
		private Node right;
		private Node left;

		public Node(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int getValue() {
			return value;
		}

	}

}

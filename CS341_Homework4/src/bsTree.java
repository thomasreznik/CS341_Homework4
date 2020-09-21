import java.util.ArrayList;
import java.util.Collections;

public class bsTree {
	// data elements
	public Node root;
	public ArrayList<Integer> nodes;

	// constructor
	public bsTree() {
		root = null;
		nodes = new ArrayList<Integer>();
	}

	// Delete Node
	public void deleteNode(int n) {
		nodes.remove(Integer.valueOf(n));
		assert (found(n) && !(isEmpty())) : "The node for " + n + " doesn't exist";
		// Variables
		Node toDelete = root;
		Node parentoTD = null;
		boolean found = false;

		// Locate the Node toDelete
		while (!found && toDelete != null) {
			if (n == toDelete.n) {
				found = true;
			} else {
				parentoTD = toDelete;
				if (n > toDelete.n) {
					toDelete = toDelete.right;
				} else
					toDelete = toDelete.left;
			}
		}

		// Scenario 0: Node not found
		if (!found)
			return;
		// Scenario 1: toDelete is a leaf
		if (toDelete.left == null || toDelete.right == null) {
			Node theChild;
			if (toDelete.left == null) {
				theChild = toDelete.left;
			} else
				theChild = toDelete.left;
			if (parentoTD == toDelete) {
				root = theChild;
			} else if (parentoTD.left == toDelete) {
				parentoTD.left = theChild;
			} else
				parentoTD.right = theChild;
			return;
		}

		// Scenario 2: toDelete has only one child
		Node smallestParent = toDelete;
		Node smallest = toDelete.right;
		while (smallest.left != null) {
			smallestParent = smallest;
			smallest = smallest.left;
		}
		toDelete.n = smallest.n;
		if (smallestParent == toDelete) {
			smallestParent.right = smallest.right;
		} else
			smallestParent.left = smallest.right;
		
		// Check if it is still a binary search tree
		assert BinarytreeCheck(): "This tree is not a binary search tree";
	}

	public void displayInorder() {

		inOrder(root);

	}

	public void displayPreorder() {
		PreOrder(root);

	}

	public void displayPostorder() {
		PostOrder(root);

	}

	public void PreOrder(Node loc) {
		assert (!isEmpty()) : "Nodes don't exist so there is nothing to display";
		if (loc != null) {
			System.out.println(loc.n);
			inOrder(loc.left);
			inOrder(loc.right);

		}
	}

	public void PostOrder(Node loc) {
		assert (!isEmpty()) : "Nodes don't exist so there is nothing to display";
		if (loc != null) {
			inOrder(loc.left);
			inOrder(loc.right);
			System.out.println(loc.n + " ");

		}

	}

	public void inOrder(Node loc) {
		assert (!isEmpty()) : "Nodes don't exist so there is nothing to display";
		if (loc != null) {
			inOrder(loc.left);
			System.out.println(loc.n);
			inOrder(loc.right);

		}
	}

	// addNode method
	public void addNode(int n) {
		nodes.add(n);

		assert !found(n) : "The node for " + n + " already is in existance";

		Node temp = new Node(n);
		if (root == null) {
			root = temp;
		} else {
			Node loc = root;

			while (true) {
				// Sub scenario a: travel to the left side
				if (temp.n < loc.n) {
					if (loc.left != null) {
						loc = loc.left;
					} else {
						loc.left = temp;
						break;

					}
				}
				// Sub scenario b: travel to the right side
				else if (loc.right != null) {
					loc = loc.right;
				} else {
					loc.right = temp;
					break;
				}

			}
		}
//Check if it is still a binary search tree
		assert BinarytreeCheck(): "This tree is not a binary search tree";
	}

	public int CountNodes(Node loc) {
		if (loc == null) {
			return 0;
		}
		return 1 + CountNodes(loc.left) + CountNodes(loc.right);
	}

	public int displayCountNodes() { // Part of Helper Method
	//	System.out.println(CountNodes(root));
	return CountNodes(root);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean found(int num) { // Helper Method

		Node nod = root;
		Node parent = null;
		boolean found = false;

		while (!found && nod != null) {
			if (num == nod.n) {
				found = true;
			} else {
				parent = nod;
				if (num > nod.n) {
					nod = nod.right;
				} else {
					nod = nod.left;
				}
			}
		}

		if (!found) {

			return found;
		}

		else {
			return found;
		}
	}

	public int singleParent(Node loc) {
		int count = 0;
		if (loc != null) {
			if (loc.left == null && loc.right != null) {
				count += 1;
			} else if (loc.left != null && loc.right == null) {
				count += 1;
			}
			count += singleParent(loc.left) + singleParent(loc.right);

		}
		return count;
	}

	public boolean BinarytreeCheck() {
		return checkBin(root, Collections.min(nodes), Collections.max(nodes));
	}

	public boolean checkBin(Node newn, int min, int max) {
		if (newn == null)
			return true;
		if (newn. n < min || newn.n > max)
			return false;
		return (checkBin(newn.left, min, newn.n - 1) && checkBin(newn.right, newn.n + 1, max));
	}

	public void displaysingleParent() {
		System.out.println(singleParent(root));

	}
}
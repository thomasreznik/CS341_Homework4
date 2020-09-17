
public class bsTreeMain {

	public static void main(String[] args) {
		bsTree tree = new bsTree();

		tree.addNode(7);
		tree.addNode(9);
		tree.addNode(5);
		tree.addNode(8);
		tree.addNode(6);
		tree.addNode(10);
		tree.addNode(3);
		// tree.deleteNode(99); //Testing assertion: This should fail because there is
		// no Node with value "99"
		// tree.deleteNode(5); // This should pass
		// tree.addNode(3); //Testing assertion: This should fail because Node value "3"
		// was already added
		// tree.displayCountNodes();
		System.out.println();
		// tree.displaysingleParent();
		// System.out.println();
		// tree.displayInorder(); //If you comment out all of the Nodes above you can
		// test the assertion
		// System.out.println();
		// tree.displayPreorder(); //If you comment out all of the Nodes above you can
		// test the assertion
		// System.out.println();
		// tree.displayPostorder(); //If you comment out all of the Nodes above you can
		// test the assertion

		System.out.println("Successful"); // If assertions pass this should be printed
	}
}

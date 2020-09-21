
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
		System.out.println(
				"There are: " + tree.displayCountNodes() + " nodes within the Binary Tree and the values are: ");
		tree.displayInorder();
		// tree.addNode(3); Testing assertion: This should fail because Node value "3"
		// was already added
		tree.addNode(15); // adding a node with value 15
		System.out.println("After adding a node with the value 15, there are: " +  tree.displayCountNodes() + " nodes and the nodes within the Binary Tree are now:");
		tree.displayInorder();
		System.out.println();
		tree.deleteNode(5);
		System.out.println("After deleting a node with the value 5, there are: " +  tree.displayCountNodes() + " nodes and the nodes within the Binary Tree are now:");
		tree.displayInorder();
		// tree.deleteNode(99); //Testing assertion: This should fail because there is
		// no Node with value "99"
		// System.out.println(tree.displayCountNodes());
		System.out.println();
		
		
		System.out.println();
		
		System.out.println("The nodes within the tree in order is: ");
		 tree.displayInorder(); //If you comment out all of the Nodes above you can
		// test the assertion
		 System.out.println();
		 System.out.println("The nodes within the tree in pre order is:");
		 tree.displayPreorder(); //If you comment out all of the Nodes above you can
		// test the assertion
		System.out.println();
		System.out.println("The nodes within the tree in post order is:");
		tree.displayPostorder(); //If you comment out all of the Nodes above you can
		// test the assertion
		System.out.println();
		
		System.out.print("The number of single parents within this binary tree is: " );
		tree.displaysingleParent();
		
		System.out.println();

		System.out.println("All the asserts passed, deeming all of the functions were successful!"); // If assertions pass this should be printed
	}
}

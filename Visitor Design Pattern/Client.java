public class Client {
    public static void main(String[] args) {
	Node root = makeTree();
	System.out.println(root);

	NodeTraverser traverser;
    traverser = new InOrderTraverser(root);
	NodeVisitor counter = new CountInts();
	Node n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new InOrderTraverser(root);
	counter = new CountDoubles();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new InOrderTraverser(root);
	counter = new CountStrings();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new InOrderTraverser(root);
	counter = new StringConcatenate();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

    traverser = new PreOrderTraverser(root);
	counter = new CountInts();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new PreOrderTraverser(root);
	counter = new CountDoubles();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new PreOrderTraverser(root);
	counter = new CountStrings();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new PreOrderTraverser(root);
	counter = new StringConcatenate();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);
    }

    public static Node makeTree() {
    Node right5 = new StringNode("pork");
    Node left5 = new StringNode("beef");
    Node right4 = new DoubleNode(5.5, left5, right5);
    Node left4 = new IntNode(18);
    Node right3 = new DoubleNode(2.2);
    Node left3 = new IntNode(52);
    Node right2 = new DoubleNode(1.1, left4, right4);    
    Node left2 = new IntNode(12, left3, right2);
	Node left = new IntNode(44, left2, null);
	Node right = new DoubleNode(6.6, null, right3);
	Node root = new IntNode(5, left, right);
	return root;
    }
}

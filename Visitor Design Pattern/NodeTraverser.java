
// Has to have knowledge about structure linkages
// in order to achieve traversal.

import java.util.Stack;

public abstract class NodeTraverser {
    private Node startNode;
    public NodeTraverser(Node n) { startNode = n; }
    public abstract Node next();
}

class InOrderTraverser extends NodeTraverser {
    private Stack<Node> stack;
    public InOrderTraverser(Node n) { 
	super(n); 
	stack = new Stack<Node>();
	stackInOrder(n);
    }
    private void stackInOrder(Node n) {
	if (n.right != null) stackInOrder(n.right);
	stack.push(n);
	if (n.left != null) stackInOrder(n.left);
    }
    public Node next() {
	if (stack.empty()) return null;
    System.out.println(stack.peek());
	return stack.pop();
    }
}

class PreOrderTraverser extends NodeTraverser {
    private Stack<Node> stack;

    public PreOrderTraverser(Node n) {
        super(n);
        stack = new Stack<Node>();
        PreOrder(n);
    }

    public void PreOrder(Node n) {
        if (n.right != null) {
            PreOrder(n.right);
        }
        if (n.left != null) {
            PreOrder(n.left);
        }
        stack.push(n);
    }

    public Node next() {
        if (stack.empty()) {
            return null;
        }
        return stack.pop();
    }
}

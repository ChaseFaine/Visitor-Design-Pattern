public abstract class NodeVisitor {
    public void visit(IntNode n) { }
    public void visit(DoubleNode n) { }
    public void visit(StringNode n) { }
}

class CountInts extends NodeVisitor {
    private int numIntNodesCounted;
    public CountInts() { numIntNodesCounted = 0; }
    public String toString() {
	return "Num IntNode objects counted is " 
	    + numIntNodesCounted + ".";
    }
    public void visit(IntNode n) { 
	numIntNodesCounted++; 
    }
}

class CountDoubles extends NodeVisitor {
    private int numDoubleNodesCounted;
    public CountDoubles() { numDoubleNodesCounted = 0; }
    public String toString() {
	return "Num DoubleNode objects counted is " 
	    + numDoubleNodesCounted + ".";
    }
    public void visit(DoubleNode n) { 
	numDoubleNodesCounted++; 
    }
}

class CountStrings extends NodeVisitor {
    private int numStringNodesCounted;
    public CountStrings() {
        numStringNodesCounted = 0;
    }
    public String toString() {
        return "Num StringNode objects counted is "
            + numStringNodesCounted + ".";
    }
    public void visit(StringNode n) {
        numStringNodesCounted++;
    }
}

class StringConcatenate extends NodeVisitor {
    private String concatenate;
    public StringConcatenate() {
        concatenate = "";
    }
    public String toString() {
        return "Concatenated Strings: " 
            + concatenate;
    }
    public void visit(StringNode n) {
        concatenate += n + " ";
    }
}

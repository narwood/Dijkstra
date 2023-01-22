package a6;

public class EdgeImpl implements Edge {
    /* You will include the implementations for any edge methods you need in this file. */

    /*Hint: Make sure you update the Edge interface in Edge.java when you add a new method implementation
    in EdgeImpl.java, and vice-versa.  getName() in Node.java and NodeImpl.java is an example.  Also, files in
    previous homeworks (e.g., BST.java and BSTImpl.java in homework 3) are good examples of
    interfaces and their implementations.
     */

    /*Also, any edge fields you want to add for the object should go in this file.  */
    private Node src;
    private Node dest;
    private double weight;

    public EdgeImpl(Node s, Node d, double w) {
        src = s;
        dest = d;
        weight = w;
        s.addOutEdge(this);
        d.addInEdge(this);
    }

    public EdgeImpl(Node s, Node d) {
        src = s;
        dest = d;
        weight = 1;
        s.addOutEdge(this);
        d.addInEdge(this);
    }

    public Node src() {return src;}

    public Node dest() {return dest;}

    public double weight() {return weight;}
}

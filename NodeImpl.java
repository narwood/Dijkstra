package a6;

import java.util.ArrayList;

public class NodeImpl implements Node {

    /* You will include the method signatures (return type, name, and arg types) for any node methods you
    need in this file. */

    /*Hint: Make sure you update the Node interface in Node.java when you add a new method implementation
    in NodeImpl.java, and vice-versa.  getName() in Node.java and NodeImpl.java is an example.  Also, files in
    previous homeworks (e.g., BST.java and BSTImpl.java in homework 3) are good examples of
    interfaces and their implementations.
     */

    /*Also, any node fields you want to add for the object should go in this file.  */

    private String name;
    private ArrayList<String> outEdges;
    private ArrayList<String> inEdges;




    public NodeImpl(String n) {
        name = n;
        outEdges = new ArrayList<String>();
        inEdges = new ArrayList<String>();
    }

    @Override
    public String getName() {return name;}
    public ArrayList<String> outEdges() {return outEdges;}
    public ArrayList<String> inEdges() {return inEdges;}
    public void remOutEdge(Edge e) {
        outEdges.remove(e.dest().getName());
    }

    public void remOutEdgeName(String name) {
        outEdges.remove(name);
    }
    public void addOutEdge(Edge e) {
        if (e.src() == this) {
            outEdges.add(e.dest().getName());
        }
    }

    public void addOutEdgeName(String name) {
        outEdges.add(name);

    }

    public void remInEdge(Edge e) {
        inEdges.remove(e.src().getName());
    }

    public void remInEdgeName(String name) {
        inEdges.remove(name);
    }

    public void addInEdge(Edge e) {
        if (e.dest() == this) {
            inEdges.add(e.src().getName());
        }
    }

    public void addInEdgeName(String name) {
        inEdges.add(name);
    }
    //getters and setters

    public boolean edgeTo(String dest) {
        if (outEdges.contains(dest)) {return true;}
        return false;
    }

    public boolean edgeFrom(String src) {
        if (inEdges.contains(src)) {return true;}
        return false;
    }

}

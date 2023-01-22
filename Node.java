package a6;

import java.util.ArrayList;

public interface Node {

     /* You will include the method signatures (return type, name, and arg types) for any node methods you
    need in this file. */

    /*Hint: Make sure you update the Node interface in Node.java when you add a new method implementation
    in NodeImpl.java, and vice-versa.  getName() in Node.java and NodeImpl.java is an example.  Also, files in
    previous homeworks (e.g., BST.java and BSTImpl.java in homework 3) are good examples of
    interfaces and their implementations.
     */

     /**
      * @return the name of the node
      */
     String getName();

     /**
      * @return private outEdge attribute
      */
     ArrayList<String> outEdges();

     /**
      * @return private inEdge attribute
      */
     ArrayList<String> inEdges();


     /**
      * @param e - edge to remove
      */
     void remOutEdge(Edge e);

     /**
      * @param name
      */
     void remOutEdgeName(String name);

     /**
      * @param e - edge to add
      */
     void addOutEdge(Edge e);

     /**
      * @param name
      */
     void addOutEdgeName(String name);

     /**
      * @param e - edge pointing in
      */
     void remInEdge(Edge e);

     /**
      * @param name
      */
     void remInEdgeName(String name);

     /**
      * @param e - edge pointing in
      */
     void addInEdge(Edge e);

     /**
      * @param name
      */
     void addInEdgeName(String name);

     /**
      * @param dest - node edge points to
      * @return true if there is an edge from node to dest
      * @return false if there is not
      */
     boolean edgeTo(String dest);

     /**
      * @param src - node edge points from
      * @return true if there is an edge from src to node
      * @return false if there is not
      */
     boolean edgeFrom(String src);

}

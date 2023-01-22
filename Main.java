package a6;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Graph g = new GraphImpl();

        //PowerPoint graph
        //instantiate nodes
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");
        g.addNode("F");
        g.addNode("G");

        //instantiate edges
        g.addEdge("A", "B", 2.0);
        g.addEdge("A", "D", 1.0);
        g.addEdge("B", "E", 1.0);
        g.addEdge("B", "D", 3.0);
        g.addEdge("C", "A", 4.0);
        g.addEdge("C", "F", 5.0);
        g.addEdge("D", "C", 2.0);
        g.addEdge("D", "F", 8.0);
        g.addEdge("D", "G", 4.0);
        g.addEdge("D", "E", 3.0);
        g.addEdge("E","G", 6.0);
        g.addEdge("G", "F", 1.0);

//        g.addNode("A");
//        g.addNode("B");
//        g.addNode("C");
//        g.addNode("D");
//
//        g.addEdge("A", "B", 1.0);
//        g.addEdge("A", "C", 3.0);
//        g.addEdge("A", "D", 2.0);
//        g.addEdge("B", "C", 1.0);
//        g.addEdge("A", "D", 2.0);
//        g.addEdge("B", "D", 0.5);


        //g.print();
        Map<String, Double> map = g.dijkstra("A");

        String[] values = {"A", "B", "C", "D", "E", "F", "G"};
        for (String s: values) {
            System.out.println(s + ": " + map.get(s));
        }

        /*DikObj e1 = new DikObj("E", 3);
        DikObj e2 = new DikObj("E", 4);
        Comparator<DikObj> compare = (a, b) -> Double.compare(a.distance(), b.distance());
        PriorityQueue<DikObj> pq = new PriorityQueue<DikObj>(compare);
        pq.add(e2);
        pq.add(e1);
        System.out.println(pq.size());
        System.out.println(pq.poll().distance());
        System.out.println(pq.size());
        System.out.println(pq.contains(e2));
        System.out.println(pq.contains(e1));*/


    }


}

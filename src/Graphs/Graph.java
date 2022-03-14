package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    int V; // number of nodes
    ArrayList<ArrayList<Integer>> graph;

    LinkedList<Integer> grph[];

    public Graph(int nodes) {
        V = nodes;

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }


        grph = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            grph[i] = new LinkedList<>();
        }

    }

   public void addEdge(int src, int dst) {

        // Array List of Array Lists
        graph.get(src).add(dst);
        graph.get(dst).add(src);

        // Array of Linked Lists
        grph[src].add(dst);
        grph[dst].add(src);

    }

    public LinkedList<Integer>[] getGraph(){

        return grph;
    }

  public void printGraph() {

        for (int i = 0; i < graph.size(); i++) {
            System.out.println();
            System.out.print("Index " +i + ":  ");
            //System.out.println(graph.get(i));
            for (int current : grph[i]){
                System.out.print(current +"  ");
            }
        }
    }
}

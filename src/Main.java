import Graphs.Graph;
import Graphs.GraphTraversals;
import LeetCode.NumIslands;
import Sorting.Bubblesort;
import Sorting.SelectionSort;
import Trees.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

  public static void main(String... args) {
    Node root = new Node(0);
    root.left = new Node(1);
    root.left.left = new Node(2);
    root.left.right = new Node(3);
    root.right = new Node(4);



//    int[][] ab = {
//            {0, 0, 1},
//            {1, 0, 0},
//            {0, 0, 0}
//    };
//
//    baseGraph.convertMatrixtoList(ab);

     Graph graph = new Graph(10);
     graph.addEdge(0,1);
     graph.addEdge(0,2);
     graph.addEdge(2,4);
     graph.addEdge(2,1);
     graph.addEdge(2,3);
     graph.addEdge(4,5);
    graph.addEdge(6,7);
    graph.addEdge(8,9);
   //  graph.printGraph();

    LinkedList<Integer>[] gr = graph.getGraph();

    GraphTraversals graphTraversals = new GraphTraversals();
  //  System.out.println(0);
   // graphTraversals.iterDFS(0, gr);
  //  graphTraversals.recDFS(0, gr);
    //graphTraversals.BFS1(0, gr);

   // System.out.println(graphTraversals.connectedComponents(gr));

    char[][] grid = {{'1','1','1','1','0'},
                       {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                         {'0','0','0','0','0'}
    };


    NumIslands numIslands = new NumIslands();
    System.out.println(numIslands.numIslands(grid));

    Bubblesort bubblesort = new Bubblesort();

    int[] arr = {7,4,1,3,2};
    bubblesort.bubbleSort(arr);

    Collections.reverse(Arrays.asList(arr));

    SelectionSort selectionSort = new SelectionSort();
    selectionSort.selectionSort(arr);

  }
}

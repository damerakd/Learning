package Graphs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class GraphTraversals {

    public void iterDFS(int source, LinkedList<Integer>[] graph) {

        boolean visited[] = new boolean[graph.length];

        Deque<Integer> stack = new ArrayDeque<>();

        stack.addFirst(source);

        visited[source] = true;

        while (!stack.isEmpty()) {

            int current = stack.removeFirst();
            //if (visited[current] ==  true) continue;

//           visited[current] = true;

            System.out.println(current);

            for (int neighbor : graph[current]) {

                if (visited[neighbor] == false) {

                    visited[neighbor] = true;
                    stack.addFirst(neighbor);
                }
            }
        }
    }

    public void recDFS(int source, LinkedList<Integer>[] graph) {

        System.out.println("Rec" + source);

        for (int neighbor : graph[source]) {
            recDFS(neighbor, graph);
        }
    }

//       graph.addEdge(0,1);
//     graph.addEdge(0,2);
//     graph.addEdge(2,4);
//    graph.addEdge(2,1);
//     graph.addEdge(2,3);
//     graph.addEdge(4,5);

    public void BFS1(int source, LinkedList<Integer>[] graph) {

        boolean visited[] = new boolean[graph.length];

        Deque<Integer> queue = new ArrayDeque<Integer>();

        queue.addLast(source);

        while (!queue.isEmpty()) {

            int current = queue.removeFirst();

            if (visited[current] == true) continue;

            visited[current] = true;
            System.out.println(current);

            for (int neighbor : graph[current]) {
                queue.addLast(neighbor);
            }
        }
    }

    boolean connectedComponentsBFS(int source, LinkedList<Integer>[] graph, boolean visited[]) {

        if (visited[source] == true) return false;

        visited[source] = true;

        Deque<Integer> queue = new ArrayDeque<Integer>();

        queue.addLast(source);

        while (!queue.isEmpty()) {

            int current = queue.removeFirst();

            for (int neighbor : graph[current]) {

                if (visited[neighbor] == false) {

                    visited[neighbor] = true;
                    queue.addLast(neighbor);
                }
            }
        }
        return true;
    }

    public int connectedComponents(LinkedList<Integer>[] graph) {

        boolean visited[] = new boolean[graph.length];

        int count = 0;

        for (int i = 0; i < graph.length; i++) {

            if (connectedComponentsBFS(i, graph, visited) == true) count += 1;

        }
        return count;
    }


}

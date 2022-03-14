package Trees;

import java.util.*;

public class TreeTraversal {

    public void iterativeBinaryTreeDFSTraversal(Node node) {

        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(node);

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            list.add(current.data);
            System.out.println(current.data);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public void recursiveBinaryTreeDFSTraversal(Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.data); // Pre-order Traversal
        if (node.left != null) recursiveBinaryTreeDFSTraversal(node.left);
        if (node.right != null) recursiveBinaryTreeDFSTraversal(node.right);

    }

    public void iterativeBFSTraversal(Node node) {

        if (node == null) {
            return;
        }

        Deque<Node> queue = new ArrayDeque<>();

        queue.addLast(node);

        while (!queue.isEmpty()) {

            Node temp = queue.removeFirst();
            System.out.println(temp.data);

            if (temp.left != null) queue.addLast(temp.left);
            if (temp.right != null) queue.addLast(temp.right);


        }

    }

}

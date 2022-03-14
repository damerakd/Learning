package Trees;

import java.util.Stack;

public class TreeMirror {

    // converts a given tree into its Mirror

    public void treeMirror(Node node) {
        if (node == null)
            return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) treeMirror(node.left);
        if (node.right != null) treeMirror(node.right);

    }

    public void iterativeTreeMirror(Node node) {
        if (node == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);

        }
    }
}

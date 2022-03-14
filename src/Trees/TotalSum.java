package Trees;

public class TotalSum {

    public int totalSumValues(Node node) {

        if (node == null)
            return 0;

        // no need to check for null for node.left as we are returning 0
        return node.data + totalSumValues(node.left) + totalSumValues(node.right);

    }
}

package Trees;

public class SearchBST {

    public void searchBST(Node node, int target) {

        if (node == null) {
            System.out.println("Element Not Found");
            return;
        }
        if (target == node.data) {
            System.out.println("Element Found");
            return;
        }
        if (target < node.data) {
            searchBST(node.left, target);
        } else {
            searchBST(node.right, target);
        }

    }
}
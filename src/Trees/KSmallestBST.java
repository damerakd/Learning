package Trees;

import java.util.ArrayList;
import java.util.List;

public class KSmallestBST {

    List<Integer> list = new ArrayList<>();

    public int kthSmallest(Node root, int k) {

         kthSmallestHelper(root, list);
         return list.get(k-1);

    }

    public void kthSmallestHelper(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) kthSmallestHelper(root.left, list);
        list.add(root.data);
        if (root.right != null) kthSmallestHelper(root.right, list);
    }
}

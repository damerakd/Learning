package Trees;

public class IsValidBST {

    public boolean isValidBST(Node root) {

        if (root.left != null || root.right != null) {
            if (root.left.data > root.data || root.right.data < root.data) {
                return false;
            }
            else{
                return true;
            }
        }
        return isValidBST(root.left) || isValidBST(root.right);
    }
}

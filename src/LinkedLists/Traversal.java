package LinkedLists;

public class Traversal {

    public void traversal(Node node) {

        if (node == null) {
            System.out.println("No elements to print in Linked List");
        }

        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public String getNodeValue(Node node, int index) {

        int count = 0;

        if (node == null) {
            return null;
        }

        while (node != null && count != index) {

            node = node.next;
            count += 1;
        }

        if (count == index)
            return Integer.toString(node.data);
        else
            return null;


    }

}

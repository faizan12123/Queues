/**
 *
 * @author faizan
 */
public class Node {

    private Object item;
    private Node next;

    public Node(Object newItem) {
        item = newItem;
        next = null;
    }

    public Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }

    public Object getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(Object newItem) {
        this.item = newItem;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

}

/**
 *
 * @author faizan
 *
 */
public class Adt {

    private Node head;
    private Node tail;

    public Adt() {
        head = null;
        tail = head;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Object newItem) {
        Node newNode = new Node(newItem);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public Object dequeue() throws QueueException {
        Object temp = null;
        if (!isEmpty()) {
            if (head == tail) {
                temp = head.getItem();
                head = null;
                tail = null;
            } else {
                tail.setNext(head.getNext());
            }
        } else {
            throw new QueueException("QueueException on dequeue and Queue Is Empty");
        }
        return temp;
    }

    public void dequeueAll() {
        head = null;
        tail = null;
    }

    public Object peek() throws QueueException {
        if (!isEmpty()) {
            return head.getItem();
        } else {
            throw new QueueException("QueueException on peek and Queue Is Empty");
        }
    }
}
class QueueException extends Exception {

    public QueueException() {
        super();
    }

    public QueueException(String errorMsg) {
        super(errorMsg);
    }
}
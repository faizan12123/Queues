/**
 *
 * @author faizan
 */
public class QueTest {


    public static void main(String[] args) throws QueueException {

        Adt faiz = new Adt();

        System.out.println(faiz.isEmpty());
        for (int i = 1; i < 8; i++) {
            faiz.enqueue(i);
            System.out.println(faiz.peek());
            faiz.dequeue();

        }
        System.out.println(faiz.isEmpty());
        faiz.dequeueAll();
        System.out.println(faiz.isEmpty());

        try{
            System.out.println(faiz.peek());
        }catch (QueueException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(faiz.dequeue());
        }catch (QueueException e) {
            System.out.println(e.getMessage());
        }
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @org.junit.jupiter.api.Test
    void testAppend() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList();
        sll = sll.append(1);
        assertEquals("1 --> NULL", sll.toString());
        sll = sll.append(2);
        sll = sll.append(3);
        assertEquals("1 --> 2 --> 3 --> NULL", sll.toString());
        }
    @org.junit.jupiter.api.Test
    void testContains() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList();
        sll = sll.append(1);
        sll = sll.append(2);
        sll = sll.append(3);
        assertTrue(sll.contains(3));
        }
    @org.junit.jupiter.api.Test
    void testdelete() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList();
        sll = sll.append(1);
        sll = sll.append(2);
        sll = sll.append(3);
        sll = sll.append(4);
       //  sll = sll.delete(1);
       // assertEquals("2 --> 3 --> NULL", sll.toString());
        sll = sll.delete(3);
        assertEquals("1 --> 2 --> 4 --> NULL", sll.toString());
    }
    @org.junit.jupiter.api.Test
    void testPushStack() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList();
        sll = sll.pushStack(1);
        sll = sll.pushStack(2);
        sll = sll.pushStack(3);
        sll = sll.pushStack(4);
        assertEquals("4 --> 3 --> 2 --> 1 --> NULL", sll.toString());
        }
    @org.junit.jupiter.api.Test
    void testPopStack() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList();
        sll = sll.popStack();
        assertEquals("NULL", sll.toString());
        sll = sll.pushStack(1);
        System.out.println(sll.toString());
        sll = sll.pushStack(2);
        System.out.println(sll.toString());
        sll = sll.pushStack(3);
        System.out.println(sll.toString());
        sll = sll.pushStack(4);
        System.out.println(sll.toString());
        sll = sll.popStack();
        System.out.println(sll.toString());
        sll = sll.popStack();
        System.out.println(sll.toString());
        sll = sll.popStack();
        System.out.println(sll.toString());
        sll = sll.popStack();
        System.out.println(sll.toString());
        sll = sll.popStack();
        System.out.println(sll.toString());
        assertEquals("NULL", sll.toString());
        }

    @Test
    void enqueue() {
        //Base data structure
        SinglyLinkedList<Integer> newq = new SinglyLinkedList();
        //adding to our SinglyLinkedList data structure
        newq.enqueue(1);
        newq.enqueue(5);
        newq.enqueue(3);;

        //Returns the front(first add that was added) and the rear(the last item that was added)
        System.out.println(newq.toString());


        //The first node should be the first node added
        assertEquals("1 --> 5 --> 3 --> NULL", newq.toString());
    }

    @Test
    void dequeue() {
        //Base data structure
        SinglyLinkedList<Integer> newq = new SinglyLinkedList();
        newq.enqueue(1);
        newq.enqueue(5);
        newq.enqueue(3);
        newq.dequeue();
        newq.enqueue(15);
        newq.enqueue(17);
        newq.enqueue(22);
        newq.dequeue();
        newq.dequeue();

        //System.out.println(newq.toString());
        //System.out.println(newq.toStringg());

        /*
        Since queue follows a First In First Out rule the first node(also the first added)
        in the structure is the first to go.
        So if we dequeue 3 times the first 3 items added(1,5,3) are the first to go.
         */
        System.out.println(newq.toString());
        assertEquals("15 --> 17 --> 22 --> NULL", newq.toString());


    }



}
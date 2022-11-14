import java.util.ArrayList;
import java.util.Collections;

public class SinglyLinkedList <T extends Comparable>{
    Node<T> head;
    Node<T> rear;
    public SinglyLinkedList(){
        this.head = null;
        }

    public SinglyLinkedList append(T data){
        //appending a node at the end of the linked list
        Node<T> toAppend = new Node(data);
        if(this.head == null){
            this.head = toAppend;
            }
        else{
            Node<T> tempNode = this.head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = toAppend;
        }
        return this;
        }
    public boolean contains(T data){
        //Checking the elements of a list if includes a node with 'data'
        if(this.head == null) return false;
        else {
            Node<T> tempNode = this.head;
            while (tempNode != null) {
                if (tempNode.data.compareTo(data)==0)
                    return true;
                else tempNode = tempNode.next;
            }
        }
        return false;
        }
    public SinglyLinkedList delete(T data) {
        //Delete the element of a list if includes a node with 'data'
        if (this.head == null) return this;
        else {
            if (this.contains(data)) {
                Node<T> tempNode = head;
                if (head.data.compareTo(data)==0)
                    head = head.next;
                else {
                    while (tempNode.next != null) {
                        if (tempNode.next.data == data)
                            tempNode.next = tempNode.next.next;
                        else tempNode = tempNode.next;
                    }
                }
            }
        }
        return this;
    }
    public SinglyLinkedList pushStack(T data){
        //Pushing an element at the head of the linked List
        Node<T> pushNode = new Node<T>(data);
        if(this.head == null) this.head = pushNode;
        else{
            pushNode.next = this.head;
            this.head = pushNode;
        }
        return this;
    }
    public SinglyLinkedList popStack() {
        //Removing the last pushed element at the head of the linked List
        if(this.head!=null)
            this.head = this.head.next;
        else System.out.println("Empty Stack");
        return this;
        }

        //Need test insert empty list
        //insertlist
        //Test insert small list

    void enqueue(int key){

        Node struc = new Node(key);

        if(this.rear == null) {

            this.head = this.rear= struc;
            return;
        }

        this.rear.next = struc;
        this.rear = struc;
    }

    void dequeue(){

        if(this.head == null)
            return;

        Node struc = this.head;
        this.head = this.head.next;

        if(this.head == null)
            this.rear = null;
    }

    public SinglyLinkedList shuffle(){

        Node<T> tempNode = this.head;
        ArrayList<T> arrayList = new ArrayList<T>();
        if(tempNode==null) System.out.println("Empty List");
        else{
            while(tempNode!=null){
                arrayList.add(tempNode.data);
                tempNode = tempNode.next;
            }
            int temp = arrayList.size() - (arrayList.size()%2);
            for(int i =0;  i <arrayList.size(); i++){
                Collections.swap(arrayList,i, i+1);
            }

            tempNode = this.head;
            for( int i=0; i<arrayList.size(); i++){
                tempNode.data= arrayList.get(i);
                tempNode = tempNode.next;
            }
        }

        return this;
    }


    public SinglyLinkedList partition(T data){

        SinglyLinkedList partitioned = new SinglyLinkedList();
        Node<T> tempNode = this.head;
        if(tempNode==null) System.out.println("Empty List");
        else{
            while(tempNode != null){
                if(tempNode.data.compareTo(data)>=0){
                    partitioned.append(tempNode.data);
                }
                tempNode = tempNode.next;
            }
        }
        return this;
    }





    @Override
    public String toString(){
        StringBuilder stb = new StringBuilder();
        if(this.head == null){
            stb.append("");
            }
        else {
            Node<T> toPrint = head;
            while (toPrint != null) {
                stb = stb.append(toPrint.data);
                stb = stb.append(" --> ");
                toPrint = toPrint.next;
            }
        }
        stb = stb.append("NULL");
        return stb.toString();
    }

}


/*


                     Notes:
                     To operate at O(1) we need to have a front and rear.
 */

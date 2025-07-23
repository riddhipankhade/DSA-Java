package Queue;

public class queue {
  //keep variables private to maintain queue integrity 
  private Node head = null; //front
  private Node tail = null; //rear
  private int size = 0;

  //define Node
  class Node {
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void enqueue(int data){
    Node newNode = new Node(data);
    if(tail == null){
      head = tail = newNode;
    }else{
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public int dequeue(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    } 

    int removed = head.data;
    head = head.next;
    if(head == null){
      tail = null;
    }
    size--;
    return removed;
  }

  public int peek(){
    if(isEmpty()){
      System.out.println("Queue is Empty.");
      return -1;
    }
    return head.data;
  }

  public boolean isEmpty(){
    return head == null;
  }

  public int size(){
    return size;
  }

public void printQueue() {
        Node current = head;
        System.out.print("Queue (front to rear): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

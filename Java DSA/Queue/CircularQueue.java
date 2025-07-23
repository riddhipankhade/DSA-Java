package Queue;

public class CircularQueue {
  private Node front, rear;
  private int size;

  private class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public CircularQueue(){
    front = rear = null;
    size = 0;
  }

  public void enqueue(int data){
    Node newNode = new Node(data);

    if(front == null){
      front = rear = newNode;
      rear.next = front; //keep the circle
    }
    size++;
  }

  public int dequeue(){
    if(front == null){
      System.out.println("Queue Underflow!");
        return -1;
    }

    int value;
    if(front == rear){
      value = front.data;
      front = rear = null;
    }else{
      value = front.data;
      front = front.next;
      rear.next = front;// to maintain circularity
    }
    size--;
    return value;
  }

  public int peek(){
    if(front == null){
      System.out.println("Queue is Empty");
    }
    return front.data;
  }

 public boolean isEmpty() {
        return front == null;
    }

    // Return size
    public int size() {
        return size;
    }

    // Print queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != front);
        System.out.println("(back to front)");
    }


  
}

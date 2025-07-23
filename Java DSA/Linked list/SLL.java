public class SLL{
  Node head;
  int size;

  public void printList(){
    Node current = head;
    while(current != null){
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
  //create a node 
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  //insert at beg
  public void insertAtBeg(int data){
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
    size++;
  }

  //insert at end
  public void insertAtEnd(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      size++;
      return;
    }

    Node current = head;
    while(current.next != null){
      current = current.next;
    }

    current.next = newNode;
    newNode.next = null;
    size++;
  }

  //insert at a position
  public void insertAtPos(int pos, int data){
    Node newNode = new Node(data);

    if(pos < 0 || pos > size){
      System.out.println("Invlaid position..");
      return;
    }

    if(pos == 0){
      insertAtBeg(data);
      return;
    }

    if(pos == size){
      insertAtEnd(data);
      return;
    }

    Node current = head;
    for(int i = 0; i < pos-1; i++){
      current = current.next;
    }

    if(current == null){
      System.out.print("Position out of bounds..");
      return;
    }

    newNode.next = current.next;
    current.next = newNode;
    size++;
  }

  //delete operations 

  public void deleteAtBeg(){
    if(head == null){
      System.out.println("the list is empty there is ntg to delete.");
      return;
    }
    head = head.next;
    size--;
  }

  public void deleteAtEnd(){
    if(head == null){
      System.out.println("the list is empty there is ntg to delete.");
      return;
    }
    if(head.next == null){
      head = null;
      size--;
      return;
    }

    Node current = head;
    while(current.next.next != null){
      current = current.next;
    }

    current.next = null;
    size--;
  }

  public void deleteAtPos(int pos){
    if(pos < 0 || pos >= size){
      System.out.println("Position invalid");
      return;
    }

    if(pos == 0){
      deleteAtBeg();
      return;
    }

    Node current = head;
    for(int i = 0; i< pos-1;i++){
      current = current.next;
    }

    current.next  = current.next.next;
    size--;
    
  }

  
}
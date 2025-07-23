public class DLL {
  Node head;
  int size;

  //node class
  class Node {
    int data;
    Node next;
    Node prev;
    
    //constructor
    Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  //insertion at beginning
  public void insertAtBeginning(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
    } else {
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    size++;
}


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
    newNode.prev = current;
    size++;
  }

  public void insertAtPos(int data, int pos){
    Node newNode = new Node(data);

    if(pos < 0 || pos > size){
      System.out.println("Position is Out Of Bounds");
      return;
    }

    if(pos == 0){
      insertAtBeginning(data);
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

    newNode.next = current.next;
    newNode.prev = current;
    current.next.prev = newNode;
    current.next = newNode;
    size++;

  }

  //delete at beginning
  public void deleteAtBeg(){
    if(head == null){
      System.out.println("List is empty");
      return;
    }

    if(head.next == null){
      head = null;
      size--;
      return;
    }

    head = head.next;
    head.prev = null;
    size--;
  }

  //delete at end
  public void deleteAtEnd(){
    if(head == null){
      System.out.println("list is empty");
      return;
    }

    if(head.next == null){
      head = null;
      size--;
      return;
    }

    Node current = head;
    while(current.next != null){
      current = current.next;
    }

    current.prev.next = null;
    size--;
  }

  //delete at position
  public void deleteAtPos(int pos){
    if(pos < 0 || pos >= size){
      System.out.println("Position out of bounds");
      return;
    }

    if(pos == 0){
      deleteAtBeg();
      return;
    }

    if(pos == size-1){
      deleteAtEnd();
      return;
    }

    Node current = head;
    for(int i = 0; i < pos; i++){
      current = current.next;
    }

    current.prev.next = current.next;
    current.next.prev = current.prev;
    size--;
  }

  public void printForward() {
    Node current = head;
    System.out.print("DLL (forward): ");
    while (current != null) {
        System.out.print(current.data + " <-> ");
        current = current.next;
    }
    System.out.println("null");
}
}

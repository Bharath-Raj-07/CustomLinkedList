public class LinkedList {
    MyNode head;
    MyNode next;
    MyNode value;

    public LinkedList() {
        this.head = null;
    }
    void addNode(int data){
        MyNode newNode = new MyNode(data);
        newNode.setNext(head);
        head=newNode;
    }
    void appendNode(int data){
        MyNode newNode = new MyNode(data);
        MyNode current=head;
        if(head == null){
            newNode.setNext(head);
            head = newNode;
            return;
        }
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(newNode);
    }

    void displayList(){
        MyNode current = head;
        while(current!=null){
            System.out.print(current.getValue() + " --> ");
            current=current.getNext();
        }
        System.out.println("End");
    }
}

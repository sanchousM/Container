

public class Container<T>{
    private class Node<T>{
        private T data;
        private Node next;

        Node(T value) {
            data = value;
            next = null;
        }
    }

    private Node head;
    private int size = 0;

    public Container(T value){
        this.head = new Node(value);
        this.size = 1;
    }

    public void addFirst(T value) {
        Node<T> temp = new Node(value);
        temp.next = this.head;
        this.head = temp;
        this.size++;
    }
    public void addLast(T value) {
        Node<T> temp = new Node(value);
        Node<T> first = this.head;
        do {
            first = first.next;
        } while (first.next != null);
        first.next = temp;
        this.size++;
    }
    public T getIndexByNode(int index){
        Node <T>temp = this.head;
        if ((size >= index +1) && (index != 0)){
            for (int i = 0; i<index; i++){
                temp = temp.next;
            }
            return(T) temp.data;
        }
        throw new RuntimeException();
    }
    public void remove(int index){
        Node <T> temp = this.head;
        Node <T> delete;
        if (index == 0){
            this.head = this.head.next;
        }
        else
        if (index <= size - 1){
            for (int i=0; i< index-1; i++){
                temp = temp.next;
            }
            delete = temp.next;
            temp.next = delete.next;
        }
        this.size++;
    }
}



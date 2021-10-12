package DataStructures;
/*code for class of node and its constructor
* @deepak
* 9/10/21
*
* */


public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

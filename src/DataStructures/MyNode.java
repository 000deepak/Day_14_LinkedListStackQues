package DataStructures;

public class MyNode<K> implements INode<K>{
    private K key;

    public MyNode getNext() {
        return next;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K Key) {
        this.key=key;

    }

    public void setNext(INode next) {
        this.next = next;
    }

    private INode next;

    public MyNode(K key){
        this.key =null;
        this.next=null;
    }

}

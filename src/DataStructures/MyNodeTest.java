package DataStructures;

public class MyNodeTest {
    public void threeNumbers() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyFirstNode.setNext(MySecondNode);
        MySecondNode.setNext(mySecondNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNodeNode);
        Assert.assertTrue(result);
    }
}

package DataStructures;

public class MyLinkedListTest {

    MyNode<Integer> myFirstNode = new MyNode<>(56);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(70);
    MyLinkedList myLinkedList=new MyLinkedListTest();
    myLinkedlist.add(myFirstNode);
    myLinkedlist.add(mySecondNode);


       /* MyFirstNode.setNext(MySecondNode);
        MySecondNode.setNext(mySecondNode);
    boolean result = myFirstNode.getNext().equals(mySecondNode) &&
            mySecondNode.getNext().equals(myThirdNodeNode);
        Assert.assertTrue(result);*/
}


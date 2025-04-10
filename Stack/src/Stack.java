public class Stack {
    private Node top;
    private int length;

    public Stack(int value){
        top = new Node(value);
        length = 1;
    }

    public void makeEmpty() {
        top = null;
        length = 0;
    }

    public Node getTop() {
        return top;
    }

    public int getLength() {
        return length;
    }
}

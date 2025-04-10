public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (this.getHeight() == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (this.getHeight() == 0) {
            return null;
        }
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
}

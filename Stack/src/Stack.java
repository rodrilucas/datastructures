public class Stack<T> {
    private Node<T> top;
    private int height;

    public Stack(T data) {
        top = new Node<T>(data);
        height = 1;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.getHeight() == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node<T> pop() {
        if (this.getHeight() == 0) {
            return null;
        }
        Node<T> temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack() {
        Node<T> temp = top;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public Node<T> getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

}

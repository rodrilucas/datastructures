public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.getLength() == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (this.getLength() == 0) {
            return null;
        }
        Node temp = tail;
        if (this.getLength() == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.getLength() == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (this.getLength() == 0) {
            return null;
        }
        Node temp = head;
        if (this.length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= this.getLength()) {
            return null;
        }
        Node temp = head;
        if (index < this.getLength() / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = this.getLength() - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == this.getLength()) {
            append(value);
            return true;
        }
        Node before = get(index - 1);
        Node after = before.next;
        Node newNode = new Node(value);
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.getLength()) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == this.getLength() - 1) {
            return removeLast();
        }
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public void swapFirstLast() {
        if (this.getLength() < 2) {
            return;
        }
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;

    }

    public void reverse(){
        if (this.getLength() == 0) {
            return;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < this.getLength(); i++){
            after = temp.next;
            temp.prev = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;
        for (int i = 0; i < this.getLength() / 2; i++) {
            if (left.value != right.value) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public void swapPairs() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            Node first = curr;
            Node second = curr.next;
            Node prev = first.prev;
            Node next = second.next;
            second.prev = prev;
            second.next = first;
            first.prev = second;
            first.next = next;
            if (prev != null) {
                prev.next = second;
            } else {
                head = second;
            }
            if (next != null) {
                next.prev = first;
            } else {
                tail = first;
            }
            curr = first.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

}

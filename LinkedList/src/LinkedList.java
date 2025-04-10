import java.util.HashSet;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
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
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (this.getLength() == 0) {
            return null;
        }
        Node temp = head;
        Node prev = temp;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (this.getLength() == 0) {
            head = null;
            temp = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.getLength() == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (this.getLength() == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (this.getLength() == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= this.getLength()) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
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
        if (index < 0 || index > this.getLength()) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == this.getLength()) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.getLength()) {
            return null;
        }
        if (index == this.getLength() - 1) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < this.getLength(); i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node findKthFromEnd(int k) {
        if (this.getLength() < k) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        if (k == 1) {
            return head;
        }
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public void partitionList(int x) {
        if (head == null) {
            return;
        }
        Node small = new Node(0);
        Node tailSmall = small;
        Node bigger = new Node(0);
        Node tailBigger = bigger;
        Node temp = head;
        while (temp != null) {
            if (temp.value < x) {
                tailSmall.next = temp;
                tailSmall = temp;
            } else {
                tailBigger.next = temp;
                tailBigger = temp;
            }
            temp = temp.next;
        }
        tailBigger.next = null;
        tailSmall.next = bigger.next;
        head = small.next;
    }

    public void removeDuplicates(){
        HashSet<Object> hashSet = new HashSet<>();
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (!hashSet.contains(temp.value)){
                hashSet.add(temp.value);
                prev = temp;
            }else {
                prev.next = temp.next;
                length--;
            }
            temp = temp.next;
        }
    }

    public int binaryToDecimal(){
        Node temp = head;
        int num = 0;
        while (temp != null){
            num = num * 2 + temp.value;
            temp = temp.next;
        }
        return num;
    }

    public void reverseBetween(int m, int n) {
        if (head == null || m == n) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 0; i < m; i++) {
            if (prev.next == null) return;
            prev = prev.next;
        }
        Node start = prev.next;
        Node next = start.next;
        for (int i = 0; i < n - m; i++) {
            if (next == null) return;
            start.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = start.next;
        }
        if (m == 0) {
            head = prev.next;
        }
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

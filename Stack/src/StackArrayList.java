import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StackArrayList<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public T pop() {
        if (stackList.isEmpty()) {
            return null;
        }
        return stackList.remove(stackList.size() - 1);
    }

    public String reverseString(String word) {
        StackArrayList<Object> stack = new StackArrayList<>();
        String reverseString = "";
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            reverseString += stack.pop();
        }
        return reverseString;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

}
package stacks;

public class CustomStack {
    // size of the array is required
    // Maximum number of elements in the stack would be equal to size of the array
    int MAX_ELEMENTS;
    int[] arr;
    int size;

    // initialization
    public CustomStack(int maxElements){
        arr = new int[maxElements];
        MAX_ELEMENTS = maxElements;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isOverflow(){
        return size > MAX_ELEMENTS;
    }

    public boolean isUnderflow(){
        return size<0;
    }

    public void push(int x){
        arr[size] = x;
        size++;
    }

    public int pop(){
        int val = arr[size-1];
        size--;
        return val;
    }

    public int peek(){
        return arr[size-1];
    }

}

package Jobsheet9;

public class StackKonversi04 {
    int[] tumpukanBiner;
    int top;
    int size;

    public StackKonversi04(int size) {
        this.size = size;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan data lagi.");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            System.out.println("Stack kosong.");
            return -1; 
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}

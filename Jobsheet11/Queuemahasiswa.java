
public class Queuemahasiswa {
    nodemhs front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(mahasiswa data) {
        nodemhs newnode = new nodemhs(data, null);
        if (isEmpty()) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Memanggil: ");
            front.data.tampilinformasi();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }
    public void peekFront() {
        if (!isEmpty()) {
            front.data.tampilinformasi();
        }else {
            System.out.println("Antrian Kosong");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            rear.data.tampilinformasi();
        }else {
            System.out.println("Antrian Kosong");
        }
    }
    public void print() {
        nodemhs temp = front;
        while (temp != null) {
            temp.data.tampilinformasi();
            temp = temp.next;
        }
    }
    public void clear() {
        front = rear = null;
        size = 0;
    }
    public int size() {
        return size;
    }
}

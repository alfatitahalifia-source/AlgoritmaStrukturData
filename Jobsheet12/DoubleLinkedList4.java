package Jobsheet12;

public class DoubleLinkedList4 {
    Node4 head;
    Node4 tail;

    public DoubleLinkedList4() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa4 data) {
        Node4 newNode = new Node4(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa4 data) {
        Node4 newNode = new Node4(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Mahasiswa4 data) {
        Node4 current = head;
        while (current != null &&
                !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM "
                    + key + " tidak ditemukan");
            return;
        }
        Node4 newNode = new Node4(data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan");
    }

    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {
        System.out.println("Data yang dihapus : ");
        head.data.tampil();
        head = tail = null;
    } else {
        System.out.println("Data yang dihapus : ");
        head.data.tampil();
        head = head.next;
        head.prev = null;
    }
}

    public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {
        System.out.println("Data yang dihapus : ");
        tail.data.tampil();
        head = tail = null;
    } else {
        System.out.println("Data yang dihapus : ");
        tail.data.tampil();
        tail = tail.prev;
        tail.next = null;
    }
}

    public void print() {
        if (isEmpty()) {
            System.out.println("Data kosong");
            return;
        }
        Node4 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Data kosong");
            return;
        }
        Node4 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("------------------");
            current = current.prev;
        }
    }
}
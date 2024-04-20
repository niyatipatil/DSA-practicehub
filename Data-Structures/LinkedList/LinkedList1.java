public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(25);
        ll.add(2500);
        ll.add(2);
        ll.add(5);
        ll.printLL();
        ll.remove(0);
        ll.printLL();
    }
}

class LinkedList {
    class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    Node head = null;
    Node tail = null;

    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            tail = head;
        } else {
            System.out.println("Adding");
            tail.next = new Node(val, null);
            tail = tail.next;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

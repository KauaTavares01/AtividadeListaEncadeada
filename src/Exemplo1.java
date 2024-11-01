public class Exemplo1 {class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

    class LinkedList {
        private Node head;

        public LinkedList() {
            this.head = null;
        }

        public void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void print() {
            Node current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public class Main {
        public void main(String[] args) {
            LinkedList list = new LinkedList();
            int[] values = {10, 20, 30};

            for (int value : values) {
                list.add(value);
            }

            list.print();
        }
    }
}

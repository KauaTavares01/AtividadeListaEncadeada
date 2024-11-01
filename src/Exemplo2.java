
    import java.util.Scanner;

    class Node {
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

        public void remove(int value) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            // Handle case where head needs to be removed
            if (head.value == value) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }

            System.out.println("Value not found in the list.");
        }

        public void print() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }

            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public class Exemplo2{
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Print list");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter a value to add: ");
                        int valueToAdd = scanner.nextInt();
                        list.add(valueToAdd);
                        break;
                    case 2:
                        System.out.print("Enter a value to remove: ");
                        int valueToRemove = scanner.nextInt();
                        list.remove(valueToRemove);
                        break;
                    case 3:
                        list.print();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 0);

            scanner.close();
        }
    }


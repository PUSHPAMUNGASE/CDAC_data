package AssignmentDS;



public class NoLinkedList {
    NoNode root;

    
    void create_list() {
        root = null;
    }

    void insert_left(int data) {
        while (data != 0) {
            int temp = data % 10;
            data = data / 10;

            NoNode n = new NoNode(temp);
            n.next = root;
            root = n;
        }
    }

    // Delete the leftmost node (head)
    void delete_left() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            NoNode t = root;
            root = root.next; // Move root to the next node
            System.out.println(t.data + " deleted");
        }
    }

    // Insert a new node at the end
    void insert_right(int data) {
        NoNode n = new NoNode(data);
        if (root == null) {
            root = n; 
        } else {
            NoNode t = root;
            while (t.next != null) {
                t = t.next; 
            }
            t.next = n; 
        }
        System.out.println(n.data + " inserted");
    }

    // Delete the rightmost node
    void delete_right() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            NoNode t = root;
            NoNode t2 = null;

            // Traverse to the last node
            while (t.next != null) {
                t2 = t;
                t = t.next;
            }

            if (t2 == null) {
                // Only one node in the list
                root = null;
            } else {
                t2.next = null; // Remove the last node
            }
            System.out.println(t.data + " deleted");
        }
    }

    // Print the linked list
    void print_list() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
            NoNode t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.println("null");
        }
    }

   
    public static void main(String[] args) {
        NoLinkedList list = new NoLinkedList();
        list.create_list();
        list.insert_left(368); // Will insert 8, 6, 3
        list.print_list(); // Output: |8|->|6|->|3|->null
        list.delete_left(); // Should delete 8
        list.print_list(); // Output: |6|->|3|->null
        list.insert_right(5); // Should insert 5 at the end
        list.print_list(); // Output: |6|->|3|->|5|->null
        list.delete_right(); // Should delete 5
        list.print_list(); // Output: |6|->|3|->null
    }
}

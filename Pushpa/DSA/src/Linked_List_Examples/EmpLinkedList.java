//package Linked_List_Examples;
//
//public class EmpLinkedList
//
//{
//
//	Node root;// linked list uses container ship-uses has a relation
//
//	void create_list() {
//		root = null;// preparing with empty root
//	}
//
//
//	
//
//	void insert_right(Emp emp) {
//		Node n = new Node(emp);
//		if (root == null)
//			root = n;// n becomes 1st so root=
//		else {
//			Node t = root;
//			while (t.next != null) {
//				t = t.next;
//
//			}
//			t.next = n;
//		}
//
//		System.out.println(root.emp + " inserted");
//
//	}
//
//	
//
//	void print_list() {
//		if (root == null)
//			System.out.println("List Empty");
//		else {
//			Node t = root;
//			while (t != null) {
//				System.out.print("|" + t.emp + "|->");
//				t = t.next;
//			}
//		}
//	}
//
//	void search_list(int ID) {
//		if (root == null)
//			System.out.println("List Empty");
//		else {
//			Node t = root;
//			while (t != null) {
//				if (t.emp.empNo == ID)// match found
//				{
//					System.out.println(t.emp + " found in list");
//					break;
//				}
//				t = t.next;
//			}
//			if (t == null)// not found
//				System.out.println(" not found in list");
//		}
//	}
//
//	void delete_element(  Emp empNo) {
//		if (root == null)
//			System.out.println("List Empty");
//		else {
//			Node t, t2;
//			t2 = t = root;
//			while (t != null) {
//				if (t.emp == empNo)// match found
//				{
//					System.out.println(t.emp + " found in list");
//					if (t == root)// case 1
//						root = root.next;
//					else if (t.next == null)// case 2
//						t2.next = null;
//					else// case 3: in between
//						t2.next = t.next;
//					System.out.println(t.emp + " deleted");
//					break;// stop the loop
//				}
//				t2 = t;
//				t = t.next;
//			}
//			if (t == null)// not found
//				System.out.println(empNo + " not found in list");
//		}
//	}
//
//}
//
////delete
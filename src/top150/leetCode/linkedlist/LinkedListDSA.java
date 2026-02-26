package top150.leetCode.linkedlist;

import java.util.List;

public class LinkedListDSA {

    public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> currentNode = head;
        LinkedListNode<Integer> previousNode = null;

        while (currentNode != null) {
            LinkedListNode<Integer> nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> previous = null;

        while (current!=null){
            LinkedListNode<Integer> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }

        LinkedListNode<Integer> middle = findMiddle(head);
        LinkedListNode<Integer> last = reverseLinkedList(middle);

        LinkedListNode<Integer> cur = head;

        while (last != null) {
            if (!cur.data.equals(last.data)) { // Use .equals() for comparing Integer objects
                return false;
            }

             last = last.next;
            cur = cur.next;
        }
        return true;
    }

    public static LinkedListNode<Integer> removeNthFromEnd(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;

        }
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }

    public LinkedListNode<Integer> mergeTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        while (list1 !=null && list1.next !=null){

        }
        return null;
    }

    public static LinkedListNode<Integer> deleteDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> previous = null;
        while(current!=null){
            if (current.next!=null && current.data.equals(current.next.data)){
                int val = current.data;
                while (current != null && current.data == val){
                    current = current.next;
                }
                if (previous!=null){
                    previous.next = current;
                }else {
                    head = current;
                }
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
      
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(2);
        head.next.next.next = new LinkedListNode<>(3);
        head.next.next.next.next = new LinkedListNode<>(4);
        head.next.next.next.next.next = new LinkedListNode<>(5);



//        boolean isPalindrome = isPalindrome(head);
//        System.out.println("Is the linked list palindrome? " + isPalindrome);

        System.out.println(head);
//        LinkedListNode<Integer> reverse = reverse(head);
//        System.out.println(reverse);
//
//        LinkedListNode<Integer> list1 = new LinkedListNode<>(1);
//        list1.next = new LinkedListNode<>(2);
//        list1.next.next = new LinkedListNode<>(3);
//        list1.next.next.next = new LinkedListNode<>(4);
//
//        LinkedListNode<Integer> list2 = new LinkedListNode<>(1);
//        list2.next = new LinkedListNode<>(3);
//        list2.next.next = new LinkedListNode<>(4);
//        list2.next.next.next = new LinkedListNode<>(5);
//
//        System.out.println(list1);
//        System.out.println(list2);

        LinkedListNode<Integer> heah = deleteDuplicates(head);
        System.out.println(heah);

    }
}

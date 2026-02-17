package top150.leetCode.linkedlist;

public class LinkedListPalindrome {

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
        LinkedListNode<Integer> fast= head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;

        }
        if(slow!=null && slow.next!=null){
            slow.next = slow.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
      
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(3);
//        head.next.next.next = new LinkedListNode<>(2);
        head.next.next.next.next = new LinkedListNode<>(4);
//        head.next.next.next.next.next = new LinkedListNode<>(5);

//        boolean isPalindrome = isPalindrome(head);
//        System.out.println("Is the linked list palindrome? " + isPalindrome);
        removeNthFromEnd(head,3);
    }
}

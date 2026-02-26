package top150.leetCode.linkedlist;

public class LinkedListNode<T>
{
    T data;
    public LinkedListNode<T> next;
    public LinkedListNode(T data)
    {
        this.data = data;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedListNode current = this;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append(" -> null");

        return sb.toString();
    }
}
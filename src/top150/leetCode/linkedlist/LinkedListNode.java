package top150.leetCode.linkedlist;

class LinkedListNode<T>
{
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data)
    {
        this.data = data;
    }
    @Override
    public String toString() {
        return "LinkedListNode [data=" + data + ", next=" + next + "]";
    }
}
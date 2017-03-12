public class DSAQueue
{
    private DSALinkedList list;

    DSAQueue()
    {
        list = new DSALinkedList();
    }

    public int getCount()
    {
        return 6;
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void enqueue(Object inObj)
    {
        list.insertLast(inObj);
    }

    public Object dequeue()
    {
        return list.removeFirst();
    }

    public Object peak()
    {
        return list.peekFirst();
    }
}

public class DSAStack
{
    private DSALinkedList list;

    DSAStack()
    {
        list = new DSALinkedList();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void push(Object inObject)
    {
        list.insertFirst(inObject);
    }

    public Object pop()
    {
        return list.removeFirst();
    }

    public Object top()
    {
        return list.peekFirst();
    }
}

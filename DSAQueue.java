public class DSAQueue
{
    private DSALinkedList list;

    DSAQueue()
    {
        list = new DSALinkedList();
    }

    public int getCount()
    {
        DSALinkedList tempList = new DSALinkedList();
        int count = 0;
    
        while(!list.isEmpty())
        {
            tempList.insertLast(list.removeFirst());
            count++;  
        }
        list = tempList;        

        return count;
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

public class DSALinkedList
{
    private Object head;
    private Object tail;

    DSALinkedList()
    {
        head = null;
        tail = null;
    }

    public void insertFirst(Object inObject)
    {
        DSAListNode newNode = new DSAListNode(inObject);

        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            newNode = head;
        }
    }

    public void insertLast(Object inObject)
    {
        DSAListNode newNode = new DSAListNode(inObject);

        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setPrev(tail);
            newNode = tail;
        }
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    peekFirst

    peekLast

    removeFirst

    removeLast



    private class DSAListNode
    {
        private Object value;
        private Object prev;
        private Object next;

        DSAListNode(Object inVal)
        {
            value = inVal;
            inPrev = null;
            inNext = null;
        }

        public Object getValue()
        {
            return value;
        }

        public void setValue(Object inVal)
        {
            value = inVal;
        }

        public Object getNext()
        {
            return next;
        }

        public void setNext(Object inNext)
        {
            next = inNext;
        }

        public Object getPrev()
        {
            return prev;
        }

        public void setPrev(Object inPrev)
        {
            prev = inPrev;
        }
    }
}

public class DSALinkedList
{
    private DSAListNode head;
    private DSAListNode tail;

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
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
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
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public boolean isEmpty()
    {
        return (head == null || tail == null);
    }

    public Object peekFirst()
    {
        Object firstObj = null;

        if(head != null)
        {
            firstObj = head.getValue();
        }
        return firstObj;
    }

    public Object peekLast()
    {
        Object lastObj = null;

        if(tail != null)
        {
            lastObj = tail.getValue();
        }
        return lastObj;
    }

    public Object removeFirst()
    {
        Object returnObj = null;

        if(isEmpty())
        {

        }
        else
        {
            returnObj = head.getValue();
            head = head.getNext();
        }

        return returnObj;
    }

    public Object removeLast()
    {
        Object returnObj = null;

        if(isEmpty())
        {

        }
        else
        {
            returnObj = tail.getValue();
            tail = tail.getPrev();
        }

        return returnObj;
    }



    private class DSAListNode
    {
        private Object value;
        private DSAListNode prev;
        private DSAListNode next;

        DSAListNode(Object inVal)
        {
            value = inVal;
            prev = null;
            next = null;
        }

        public Object getValue()
        {
            return value;
        }

        public void setValue(Object inVal)
        {
            value = inVal;
        }

        public DSAListNode getNext()
        {
            return next;
        }

        public void setNext(DSAListNode inNext)
        {
            next = inNext;
        }

        public DSAListNode getPrev()
        {
            return prev;
        }

        public void setPrev(DSAListNode inPrev)
        {
            prev = inPrev;
        }
    }
}

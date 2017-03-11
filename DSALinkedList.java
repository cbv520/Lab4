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
            if(tail.getPrev() == null)
            {
                tail.setPrev(head);
            }
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
            if(head.getNext() == null)
            {
                head = tail;
            }
        }
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public Object peekFirst()
    {
        return head.getValue();
    }

    public Object peekLast()
    {
        return tail.getValue();
    }

    public Object removeFirst()
    {
        DSAListNode returnNode = null;

        if(isEmpty())
        {

        }
        else
        {
            returnNode = new DSAListNode(head.getValue());
            head = head.getNext();
        }

        return returnNode.getValue();
    }

    public Object removeLast()
    {
        DSAListNode returnNode = null;

        if(isEmpty())
        {

        }
        else
        {
            returnNode = new DSAListNode(tail.getValue());
            tail = tail.getPrev();
        }

        return returnNode.getValue();
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

public class Test
{
    public static void main(String[] args)
    {
        DSALinkedList list = new DSALinkedList();

        Blob blob1 = new Blob("1");
        Blob blob2 = new Blob("2");
        Blob blob3 = new Blob("3");
        Blob blob4 = new Blob("4");
        Blob blob5 = new Blob("5");

        System.out.print("insertFirst/removeFirst    ");
        list.insertFirst(blob1);
        System.out.print(list.removeFirst());
        list.insertFirst(blob2);
        System.out.print(list.removeFirst());
        list.insertFirst(blob3);
        System.out.print(list.removeFirst());
        System.out.print("    ");
        if(list.isEmpty())
        {
            System.out.print("Empty");
        }
        else
        {
            System.out.print("Not Empty");
        }

        System.out.print("    ");

        list.insertFirst(blob1);
        list.insertFirst(blob2);
        list.insertFirst(blob3);
        list.insertFirst(blob4);
        list.insertFirst(blob5);
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print("    ");

        list.insertFirst(blob1);
        list.insertFirst(blob2);
        list.insertFirst(blob3);
        list.insertFirst(blob4);
        list.insertFirst(blob5);
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print("    ");

        list.insertFirst(blob1);
        list.insertFirst(blob2);
        list.insertFirst(blob3);
        list.insertFirst(blob4);
        list.insertFirst(blob5);
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print(list.removeFirst());
        System.out.print("    ");
        if(list.isEmpty())
        {
            System.out.print("Empty");
        }
        else
        {
            System.out.print("Not Empty");
        }
        System.out.println("");

       // list.insertLast();

       // System.out.println(list.removeFirst());

       // System.out.println(list.removeLast());

       System.out.print("insertFirst/removeLast    ");
       list.insertFirst(blob1);
       System.out.print(list.removeLast());
       list.insertFirst(blob2);
       System.out.print(list.removeLast());
       list.insertFirst(blob3);
       System.out.print(list.removeLast());
       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }

       System.out.print("    ");

       list.insertFirst(blob1);
       list.insertFirst(blob2);
       list.insertFirst(blob3);
       list.insertFirst(blob4);
       list.insertFirst(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print("    ");

       list.insertFirst(blob1);
       list.insertFirst(blob2);
       list.insertFirst(blob3);
       list.insertFirst(blob4);
       list.insertFirst(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print("    ");

       list.insertFirst(blob1);
       list.insertFirst(blob2);
       list.insertFirst(blob3);
       list.insertFirst(blob4);
       list.insertFirst(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }
       System.out.println("");

       System.out.print("insertLast/removeFirst    ");
       list.insertLast(blob1);
       System.out.print(list.removeFirst());
       list.insertLast(blob2);
       System.out.print(list.removeFirst());
       list.insertLast(blob3);
       System.out.print(list.removeFirst());
       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }

       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print(list.removeFirst());
       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }
       System.out.println("");

       System.out.print("insertLast/removeLast    ");
       list.insertLast(blob1);
       System.out.print(list.removeLast());
       list.insertLast(blob2);
       System.out.print(list.removeLast());
       list.insertLast(blob3);
       System.out.print(list.removeLast());
       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }

       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print("    ");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertLast(blob4);
       list.insertLast(blob5);
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.print(list.removeLast());
       System.out.println("");

       System.out.print("    ");
       if(list.isEmpty())
       {
           System.out.print("Empty");
       }
       else
       {
           System.out.print("Not Empty");
       }
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("");

       list.insertLast(blob1);
       list.insertLast(blob2);
       list.insertLast(blob3);
       list.insertFirst(blob4);
       while(!list.isEmpty())
       {
           System.out.print(list.removeFirst());
       }
       System.out.println("\ndone");

    }
}

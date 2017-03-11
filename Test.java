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

        list.insertLast(blob1);
        list.insertLast(blob2);
        list.insertLast(blob3);
        list.insertLast(blob4);
        list.insertLast(blob5);

        System.out.println((Blob)(list.removeFirst()));
        System.out.println((Blob)(list.removeFirst()));
        System.out.println((Blob)(list.removeFirst()));
        System.out.println((Blob)(list.removeFirst()));
        System.out.println((Blob)(list.removeFirst()));

    }
}

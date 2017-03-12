public class StackTest
{
    public static void main(String[] args)
    {
        DSAQueue stack = new DSAQueue();

        Blob blob1 = new Blob("1");
        Blob blob2 = new Blob("2");
        Blob blob3 = new Blob("3");
        Blob blob4 = new Blob("4");
        Blob blob5 = new Blob("5");

        stack.enqueue(blob1);
        System.out.println(stack.dequeue());
        stack.enqueue(blob2);
        stack.enqueue(blob3);
        stack.enqueue(blob4);
        System.out.println(stack.peak());
        while(!stack.isEmpty())
        {
            System.out.println(stack.dequeue());
        }
    }
}

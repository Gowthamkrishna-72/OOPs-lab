package LAB5;

/*
Q.1)Image a queue of people standing at the bus stand to buy tickets .whenever a person buys a ticket,he leaves
the queue and all the remaining people take one step forward.any new person joins the queue at the
back.implement the above queue for integer in the folowing mannerdefine an interface named QueueImpl that
will have method to insert into the queue ,delete from the queue and display the integer currently present int the
queue.let a class calleld QueueDemo implement the interface .Make your own provisions for exception handaling
in case of overflow and underflow condation use an array (with maximum size 10) to hiuse the queue. Write a
single main program ti demonstrate the insert ,delete and display operations as well as the Exception handaling
in case of overflow and underflow condation.
*/

interface QueueImpl {
    void insertQueue(int value) throws Exception;

    int deleteQueue() throws Exception;

    void displayQueue();

}

class QueueDemo implements QueueImpl 
{
    private int[] queue = new int[10];
    private int front = -1;
    private int rear = -1;
    private final int MAX = 10;

    public void insertQueue(int value) throws Exception 
    {
        if (rear == MAX - 1)
            throw new Exception("Queue Overflow! Cannot insert" + value);

        if (front == -1)
            front = 0;

        queue[++rear] = value;
        System.out.println(value + " inserted into queue.");
    }

    public int deleteQueue() throws Exception 
    {
        if (front == -1 || front > rear)
            throw new Exception("Queue Underflow! Nothing to delete.");

        int deleted = queue[front++];
        System.out.println(deleted + " deleted from queue.");
        return deleted;
    }

    public void displayQueue() 
    {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class L51 
{
    public static void main(String[] args) 
    {
        QueueImpl q = new QueueDemo();

        try 
        {
            for (int i = 1; i <= 10; i++) 
            {
                q.insertQueue(i * 10);
            }

            q.displayQueue();

            q.insertQueue(999);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }

        try 
        {
            for (int i = 0; i < 10; i++) 
            {
                q.deleteQueue();
            }

            q.displayQueue();

            q.deleteQueue();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

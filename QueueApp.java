package gr.aueb.cf.ch6;

public class QueueApp {

    static int[] queue = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    public static void enQueue(int num) {
        if(isFull()){
            System.out.println("the queue is full");
            return;
        }
        queue[++pivot] = num;
    }

    public static int deQueue (int num) {
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }

        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    public static void shiftQueueLeft () {
        for (int i = 0; i <= pivot; i++){
            queue[i] = queue[i+1];
        }
    }

    public static boolean isEmpty (){
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queue.length -1 ;
    }

}

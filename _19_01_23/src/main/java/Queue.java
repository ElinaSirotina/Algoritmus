public class Queue {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int count;  // текущее количество элементов в очереди
    private int head;
    private int tail;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        head = 0;
        tail = -1;
        count = 0;
    }

    public int peek() {
        return queue[0];
    }

    public void push(int elem) {
        if (tail == maxSize - 1) {  // циклический перенос
            tail = -1;
        }
        queue[++tail] = elem;  //увеличение Rear и вставка
        count++;  // увеличение количества элементов в очереди
    }

    public int remove() {
        int temp = queue[head++]; // получаем первый элемент из очереди

        if (head == maxSize) { // циклический перенос
            head = 0;
        }
        count--; // уменьшаем количество элементов в очереди
        return temp;
    }


    public boolean isFull() {
        return (count == maxSize - 1);
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int getSize() {
        return count;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        myQueue.push(40);
        myQueue.push(50);
        System.out.println(myQueue.peek());

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        myQueue.push(60);

        while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Elem: " + n);
        }
    }
}

public class QueueImpl<E> implements Queue<E> {
    E[] queue;
    int i;
    int max;

    /**
     * Constructor (inicialitzar la cua)
     */
    public QueueImpl(int length) {
        this.queue = (E[]) new Object[length];
        this.i = 0;
        this.max = length;
    }

    /**
     * Push (posar element a la cua)
     * Torna la cua amb l'element afegit
     */
    public void push(E e) throws FullQueueException {
        if (isFull()) throw new FullQueueException();
        else {
            queue[i] = e;
            i++;
        }
    }

    /**
     * Pop (treure element de la cua)
     */
    public E pop() throws EmptyQueueException {
        E[] cua;
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        E poppedElement = queue[0];
        reorder(queue);
        i--;
        return poppedElement;

    }

    public int size() {
        return i;
    }

    private boolean isFull() {
        return (i == max);
    }

    private boolean isEmpty() {
        return (i == 0);
    }

    private void reorder(E[] queue) {
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }


    }
}

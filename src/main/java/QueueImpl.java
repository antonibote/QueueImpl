public class QueueImpl<E> implements Queue<E>{
    E[] queue;
    int i;

    /**
     * Constructor (inicialitzar la cua)
     */
    public QueueImpl(int length) {
        this.queue = (E[]) new Object[length];
        this.i = 0;
    }
    public int size() {
        return this.i;
    }

    /**
     * Push (posar element a la cua)
     * Torna la cua amb l'element afegit
     */

    public void push(E e) throws FullQueueException {
        if (this.size() == queue.length) throw new FullQueueException();
        else {
            queue[i] = e;
            i++;
        }
    }

    /**
     * Pop (treure element de la cua)
     */

    public E pop() throws EmptyQueueException {
        if (this.size() == 0) {
            throw new EmptyQueueException();
        }
        else {

        }
        return null;
        }




}

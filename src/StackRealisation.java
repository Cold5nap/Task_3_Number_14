import java.util.Iterator;

public class StackRealisation<T> implements Iterable<T> {

    protected class StackItem {
        public T value;
        public StackItem next;

        public StackItem(T value, StackItem next) {
            this.value = value;
            this.next = next;
        }
    }

    protected StackItem head = null;
    protected StackItem tail = null;
    protected int size = 0;

    public void add(T value) {
        StackItem temp = new StackItem(value, null);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new Exception("Incorrect index");
        }
        StackItem curr = head;
        while (index != 0) {
            index--;
            curr = curr.next;
        }
        return curr.value;
    }

    @Override
    public Iterator<T> iterator() {
        class StackIterator implements Iterator<T> {
            StackItem curr;

            public StackIterator(StackItem head) {
                curr = head;
            }

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                T result = curr.value;
                curr = curr.next;
                return result;
            }
        }
        return new StackIterator(head);
    }

}

package iterator;


/**
 * @author kangkang lou
 */
public class SimpleContainer<T> implements Container<T> {
    public T[] names;
    private int size = 0;

    public SimpleContainer(int length) {
        names = (T[]) new Object[length];
    }

    public void add(T t) {
        if (size < names.length) {
            names[size++] = t;
        }
    }

    @Override
    public Iterator iterator() {
        return new SimpleIterator();
    }

    private class SimpleIterator<T> implements Iterator<T> {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                return (T) names[index++];
            }
            return null;
        }
    }
}
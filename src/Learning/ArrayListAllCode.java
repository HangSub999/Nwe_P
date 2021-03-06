package Learning;

public class ArrayListAllCode {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addLast(Object elment) {
        elementData[size] = elment;
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element) {

        return add(0, element);
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i];
            if (i < size - 1) {
                str += ",";
            }
        }
        return str + "]";
    }

    public Object remove(int index) {
        Object removed = elementData[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return removed;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object elment) {
        for (int i = 0; i < size; i++) {
            if (elment.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < size();
        }

        public Object next() {
            return elementData[nextIndex++];
        }

        public Object previous() {
            return elementData[--nextIndex];
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

    }
}



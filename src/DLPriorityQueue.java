import java.util.LinkedList;
import java.util.List;

public class DLPriorityQueue<K extends Comparable, V> implements VCPriorityQueue<K, V>{

    private List<Entry<K, V>> queue2;

    public DLPriorityQueue() {
        queue2 = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue2.size();
    }

    @Override
    public boolean isEmpty() {
        return queue2.isEmpty();
    }

    @Override
    public Entry<K, V> enqueue(K key, V value) throws IllegalArgumentException {
        Entry<K, V> before = new Entry<>(key, value);
        Entry<K, V> after = new Entry<>(key, value);
        Entry<K, V> newEntry = new Entry<>(key, value);
        queue2.add(before);
        queue2.add(after);
        queue2.add(newEntry);
        if (before == null && after == null) {
            before = newEntry;
            after = newEntry;
        } else {
            if (newEntry.getKey().compareTo(before.getKey()) > 0) {
                before = newEntry;
            } else if (newEntry.getKey().compareTo(before.getKey()) < 0) {
                after = newEntry;
            }
        }
        return newEntry;
    }

    @Override
    public Entry<K, V> peek() {
        return queue2.get(0);
    }

    @Override
    public Entry<K, V> dequeueMin() {
        return queue2.remove(0);
    }

    public List<Entry<K, V>> getQueue2() {
        return queue2;
    }

    @Override
    public VCPriorityQueue<K, V> merge(VCPriorityQueue<K, V> other) {
        DLPriorityQueue<K, V> otherQ = ((DLPriorityQueue) other);
        for (Entry<K, V> entry : otherQ.getQueue2()) {
            for (int i = 0; i < queue2.size(); i++) {
                if (queue2.get(i).getKey().compareTo(entry.getKey()) < 0) {
                    entry = queue2.get(i);
                }
            }
        }
        return this;
    }
}

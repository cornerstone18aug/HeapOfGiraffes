import java.util.ArrayList;
import java.util.List;

public class DLPriorityQueue<K extends Comparable, V> implements VCPriorityQueue<K, V>{

    private List<Entry<K, V>> queue2;

    public DLPriorityQueue() {
        queue2 = new ArrayList<>();
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
        Entry<K, V> newEntry = new Entry<>(key, value);
        return null;
    }

    @Override
    public Entry<K, V> peek() {
        return null;
    }

    @Override
    public Entry<K, V> dequeueMin() {
        return null;
    }

    @Override
    public VCPriorityQueue<K, V> merge(VCPriorityQueue<K, V> other) {
        return null;
    }
}

package pattern.iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max + 1;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int a = random.nextInt(min, max);

            @Override
            public boolean hasNext() {
                return a >= min;
            }


            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };

    }

}

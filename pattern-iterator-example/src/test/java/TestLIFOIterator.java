import com.aggredi.pattern.iterator.example.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class TestLIFOIterator {

    @Test
    public void testLIFOIterator() {
        List<Integer> integers = new CustomArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Iterator<Integer> iterator = integers.iterator();
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        Assert.assertArrayEquals(result.toArray(new Integer[result.size()]), new Integer[]{3,2,1});
        System.out.println(result);
        Assert.assertEquals(integers.size(), 0);
    }
}

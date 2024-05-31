import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListJavaTest {

    @Test
    public void testPushAndPop() {
        LinkedListJava<Integer> list = new LinkedListJava<>();
        list.push(7);
        assertEquals((Integer) 7, list.pop());

        list.push(11);
        list.push(13);
        assertEquals((Integer) 13, list.pop());
        assertEquals((Integer) 11, list.pop());
    }

    @Test
    public void testShift() {
        LinkedListJava<Integer> list = new LinkedListJava<>();
        list.push(17);
        assertEquals((Integer) 17, list.shift());

        list.push(23);
        list.push(5);
        assertEquals((Integer) 23, list.shift());
        assertEquals((Integer) 5, list.shift());
    }

    @Test
    public void testUnshift() {
        LinkedListJava<Integer> list = new LinkedListJava<>();
        list.unshift(17);
        assertEquals((Integer) 17, list.shift());

        list.unshift(23);
        list.unshift(5);
        assertEquals((Integer) 5, list.shift());
        assertEquals((Integer) 23, list.shift());
    }
}

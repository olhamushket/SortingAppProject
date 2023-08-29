
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingAppTest {

    SortingApp sortingApp = new SortingApp();
    private final int[] input;
    private final int[] expected;

    public SortingAppTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[]{3, 1, 5}, new int[]{5, 3, 1} },
                { new int[]{}, new int[]{} }
        });
    }

    @Test
    public void testSort() {
        sortingApp.sort(input);
        assertArrayEquals(expected, input);
    }
}

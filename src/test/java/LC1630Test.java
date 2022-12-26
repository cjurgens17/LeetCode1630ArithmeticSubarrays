import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LC1630Test {

    @org.junit.Test
    public void checkArithmeticSubarrays() {

        List<Boolean> actual1 = LC1630.checkArithmeticSubarrays(new int[] {4,6,5,9,3,7}, new int[] {0,0,2}, new int[] {2,3,5});
        List<Boolean> actual2 = LC1630.checkArithmeticSubarrays(new int[] {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, new int[] {0,1,6,4,8,7}, new int[] {4,4,9,7,9,10});

        List<Boolean> expected1 = new ArrayList<>();
        expected1.add(true);
        expected1.add(false);
        expected1.add(true);

        List<Boolean> expected2 = new ArrayList<>();
        expected2.add(false);
        expected2.add(true);
        expected2.add(false);
        expected2.add(false);
        expected2.add(true);
        expected2.add(true);

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }
}
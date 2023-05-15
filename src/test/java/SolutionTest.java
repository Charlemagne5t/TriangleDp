import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void minimumTotalTest1(){
        List<List<Integer>> list = new ArrayList<>(List.of(
                new ArrayList<>(List.of(2)),
                new ArrayList<>(List.of(3,4)),
                new ArrayList<>(List.of(5,6,7)),
                new ArrayList<>(List.of(4,1,8, 3))
        ));
        Assert.assertEquals(11, new Solution().minimumTotal(list));
    }
}

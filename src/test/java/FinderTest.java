import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {
//maxtests
    @Test
    public void findMaxEmpty() {
        Finder find = new Finder();
        int[] testArr = new int[0];
        Integer expectRes = null;
        Integer actualRes = find.findMax(testArr);
        assertEquals(actualRes, expectRes);
    }

    @Test
    public void findMaxNull() {
        Finder find = new Finder();
        int[] testArr = null;
        Integer expectRes = null;
        Integer actualRes = find.findMax(testArr);
        assertEquals(actualRes, expectRes);
    }

    @Test
    public void findMaxValid() {
        Finder find = new Finder();
        int[] testArr = new int[] {5,3,8,5,7,2,9};
        Integer expectRes = 9;
        Integer actualRes = find.findMax(testArr);
        assertEquals(actualRes, expectRes);
    }
//mintests
    @Test
    public void findMinEmpty() {
        Finder find = new Finder();
        int[] testArr = new int[0];
        Integer expectRes = null;
        Integer actualRes = find.findMax(testArr);
        assertEquals(actualRes, expectRes);
    }

    @Test
    public void findMinNull() {
        Finder find = new Finder();
        int[] testArr = null;
        Integer expectRes = null;
        Integer actualRes = find.findMin(testArr);
        assertEquals(actualRes, expectRes);
    }

    @Test
    public void findMinValid() {
        Finder find = new Finder();
        int[] testArr = new int[] {5,3,8,5,7,2,9};
        Integer expectRes = 9;
        Integer actualRes = find.findMin(testArr);
        assertEquals(actualRes, expectRes);
    }
}
import static org.junit.Assert.*;


public class BinarySearchTest {
    @org.junit.Test
    public void binarySearchTest() throws Exception {
        assertEquals(7, BinarySearch.binarySearch(new int[] {0,3,8,44,21,78,12,1,19,25}, 25));

        assertEquals(0, BinarySearch.binarySearch(new int[] {0,1,2,3,4,5,6,7,8,9,10}, 0));
        assertEquals(10, BinarySearch.binarySearch(new int[] {0,1,2,3,4,5,6,7,8,9,10}, 10));
        assertEquals(5, BinarySearch.binarySearch(new int[] {0,1,2,3,4,5,6,7,8,9,10}, 5));

        assertEquals(-1, BinarySearch.binarySearch(new int[] {0,3,8,44,21,78,12,1,19,25}, 100));
    }


}
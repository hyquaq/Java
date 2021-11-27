import java.util.Arrays;

/**
 * Test
 */
public class Test {

    // HeapSort(array)
    // BuildHeap(array)
    // for i <- 0 -> n-1 do
    // A[i] = ExtracMax()
    // end
    // return A

    public static void HeapSort(int[] array) {
        //
        MaxHeap maxheap = new MaxHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            maxheap.insert(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = maxheap.extractMax();
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 4, 56, 6, 7, 4, 6, 7, 8, 1, 2, 3, 1, 2, 0, 19, 20, 452 };

        HeapSort(a);

        System.out.println(Arrays.toString(a));

    }
}
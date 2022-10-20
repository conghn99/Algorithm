import java.util.Arrays;

public class _1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i< arr2.length;i++) {
            for (int j = 0; j< arr1.length;j++) {
                if (arr2[i] == arr1[j]) {
                    int temp = arr1[count];
                    arr1[count] = arr1[j];
                    arr1[j] = temp;
                    count++;
                }
            }
        }
        Arrays.sort(arr1, count, arr1.length);
        return arr1;
    }
}


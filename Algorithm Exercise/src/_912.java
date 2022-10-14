import java.util.Arrays;

public class _912 {
    public static void main(String[] args) {
        int[] arr = {20,15,35,60,55,90,75};
        arr = sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] arr, int iL, int iR) {
        if(iL == iR) {
            int[] singleElement = {arr[iL]};
            return singleElement;
        }

        int iM = (iL + iR)/2;
        int[] arr1 = sort(arr, iL, iM);
        int[] arr2 = sort(arr, iM +1, iR);
        int[] result = merge(arr1, arr2);
        return result;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0, j = 0, k = 0;

        while (k<n) {
            if(i<arr1.length && j<arr2.length) {
                if(arr1[i] <= arr2[j]) {
                    result[k] = arr1[i];
                    i++;
                } else {
                    result[k] = arr2[j];
                    j++;
                }
            } else {
                if(i< arr1.length) {
                    result[k] = arr1[i];
                    i++;
                } else {
                    result[k] = arr2[j];
                    j++;
                }
            }
            k++;
        }

        return result;
    }
}

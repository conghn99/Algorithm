public class _905 {
    int[] arr1 = {3,1,2,4};
    int[] arr2 = sortArrayByParity(arr1);
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] % 2 == 0) {
                arr[count] = nums[i];
                count++;
            }
        }

        while (count<=nums.length-1) {
            for (int i = 0;i<nums.length;i++) {
                if (nums[i] % 2 != 0) {
                    arr[count] = nums[i];
                    count++;
                }
            }
        }
        return arr;
    }
}

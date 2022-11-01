class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        int[] index = new int[2];
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum < target){
                low++;
            } else if (sum > target){
                high--;
            } else {
                index[0] = low + 1;
                index[1] = high + 1;
                break;
            }
        }
        return index;
    }
}
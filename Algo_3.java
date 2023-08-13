class Algo_3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50}, newNums = new int[nums.length];
        int pastIndex = nums.length - 1;
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[pastIndex];
            pastIndex--;
        }
        nums = newNums;
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", " );
        }
        System.out.println("\b".repeat(2)+"}");
    }
}

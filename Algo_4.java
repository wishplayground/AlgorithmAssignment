class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int prev, pastIndex = nums.length - 1;

        //invert the array
        for (int i = 0; i < nums.length; i++) {
            if(i == pastIndex) break;
            else{
                prev = nums[i];
                nums[i] = nums[pastIndex];
                nums[pastIndex] = prev;
                pastIndex--;
            }
        }
        //print output
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print("\b".repeat(2) + "}\n");

    }
}

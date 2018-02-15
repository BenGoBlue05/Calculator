public class Calculator {
    public int multiply(String[] nums) {
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                if (nums[0] == null || nums[0].equals("")) return 0;
                return Integer.parseInt(nums[0]);
            case 2:
                return Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
            default:
                throw new IllegalArgumentException("Input array cannot have more than 2 numbers");
        }
    }
}

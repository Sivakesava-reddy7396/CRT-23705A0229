public class Main {
    public static void main(String[] args) {
        int[] nums={10,29,2,4,1,8,9};
        int target = 10;
        int index = -1;
        for (int i = 0;i<nums.length-1;i++){
            if(target == nums[i])
            index = i;
        }
        System.out.println(index == -1 ?"elements are not found" : "elements found at index:"+index);
    }
}
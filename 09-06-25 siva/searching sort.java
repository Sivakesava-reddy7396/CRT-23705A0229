public class main{
    public static void main(String[]args){
        int[] nums={19,21,3,8,10,12};
        for(int i=0;i<nums.length-1;i++){
            int minIndex = 1;
            for(int j =i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        for(int val:nums){
            System.out.print(val +"");
        }
    }
}
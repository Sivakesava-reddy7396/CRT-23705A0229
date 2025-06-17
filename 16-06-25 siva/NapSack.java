public class NapSack {

	public static void main(String[] args) {
		System.out.println(napSack(8,0,new int[] {1,3,5,7},new int[] {2,4,7,10}));
	}
	public static int napSack(int bagWeight,int selectedElement,int[]weight,int[]profit) {
		if(selectedElement>=weight.length||bagWeight==0) {
			return 0;
		}
		int pick=0;
		if(bagWeight>=weight[selectedElement]) {
			pick=profit[selectedElement]+napSack(bagWeight-weight[selectedElement],selectedElement+1,weight,profit);
		}
		int notPick=napSack(bagWeight,selectedElement+1,weight,profit);
		return Math.max(pick, notPick);
	}

}
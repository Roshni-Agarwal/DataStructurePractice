package WorkShop;

public class WaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findTotalWater(int[] arr,int n) {
		int totalwater=0;
		
		for(int i=1;i<n-1;i++) {
			int leftmax=findLeftMax(arr,n,i);
			int rightmax=findRightMax(arr,n,i);
			//totalwater=totalwater+ min(leftmax,rightmax)-arr[i];
		}
		return totalwater;
	}
	
	public static int findLeftMax(int[] arr, int n, int i) {
		int maximum=0;
		for(int j=0;j<=i;j++) {
			//maximum=max(maximum,arr[i]);
		}
		return maximum;
	}
   public static int findRightMax(int[] arr, int n, int i) {
	   int maximum=0;
		for(int j=0;j<=i;j++) {
			//maximum=max(maximum,arr[i]);
		}
		return maximum;
	}

}

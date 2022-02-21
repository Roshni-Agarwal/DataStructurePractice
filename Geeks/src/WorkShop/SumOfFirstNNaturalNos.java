package WorkShop;

public class SumOfFirstNNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun1(20));
		System.out.println(fun2(20));

	}
	
	//time complexcity o(n) space complexcity O(1)
	public static int fun1(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	//
	public static int fun2(int n) {
		
		return (n*(n+1))/2;
	}
	

}

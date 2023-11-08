package loooping;

public class For_Loop_array {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
			//for each loop
		for(int a:arr) {
			System.out.println(a);
		}
	}

}

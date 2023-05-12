package day6Assignment.arrayPrograms;

public class CopyArray {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7};
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			
		}
		System.out.println();
		System.out.println("old arry");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("new elements");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}

	}
}

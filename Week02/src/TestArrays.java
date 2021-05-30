public class TestArrays {
	
	public static void main(String[] args) {
		//1D Array and Pass By Value
		int[] arr = {1, 2, 3};		// arr is of type int[]
		// alternative int arr[] = {1, 2, 3};
		// alternatively could do bellow and set after the fact
		//int[] arr = new int[3];
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		change(arr);
		// above still 'changed' values
		// even though it was passed by value (a copy of the reference) the change method was still
		// able to point to same place and access and modify same elements at address
		// so with passing 'arr' we are passing a copy of the whole reference value
		
		// NOTE!!!
		// if we pass a copy of an element, such as arr[1], we are passing a copy of an INTEGER, not a copy 
		// of a reference so arr[1] won't change

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();

		//2D Array and Traverse
		int[][] arr2D = { {1, 2, 3}, {4, 5}, {6} };
		
		for (int i = 0; i < arr2D.length; i++) {//rows
			for (int j = 0; j < arr2D[i].length; j++) {//columns
				System.out.printf("%d ", arr2D[i][j]);
			}
			System.out.println();
		}		
		
		// enhanced for [new for] - doesn't allow access to indexs however
		for (int[] row : arr2D) {
			for (int i : row) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}
	
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
	}

}

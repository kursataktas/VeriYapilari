public class BubbleSort { 

	public static void sort(int arr[]) {
		int swapCount, temp;

		for (int i = 0; i < arr.length; i++) {
			swapCount = 0;

			for (int j = 0; j < arr.length - 1; j++) 
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					swapCount += 1;
				}

			if (swapCount == 0) 
				break;
			
		}
	}
} 

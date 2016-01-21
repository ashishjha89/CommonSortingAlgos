public class InsertionSort {

	public void insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
		}
	}
}

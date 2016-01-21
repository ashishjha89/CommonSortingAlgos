public class QuickSort {

	public int partition(int[] A, int l, int r) {
		int p = A[l];
		int i = l + 1;
		int j = r;
		while (i < j) {
			while (i < r && A[i] < p) {
				i++;
			}
			while (j > l && A[j] > p) {
				j--;
			}
			swap(A, i, j);
		}
		// Undo last swap when i>=j
		swap(A, i, j);
		swap(A, l, j);
		return j;
	}

	public void quickSort(int[] A, int l, int r) {
		if (l >= r) {
			return;
		}
		int s = partition(A, l, r);
		if (s > l) {
			quickSort(A, l, s - 1);
		}
		if (s < r) {
			quickSort(A, s + 1, r);
		}
	}

	public void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}

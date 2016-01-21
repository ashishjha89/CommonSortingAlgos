public class HeapSort {

	// Heap Bottom Up
	// For a key at index 'k', it's children are at position 2k+1 and 2k+2
	public int[] heapify(int[] H, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) {
			boolean heap = false;
			int k = i;
			int v = H[k];
			while (!heap && ((2 * k) + 1 < n)) {
				int j = (2 * k) + 1;
				if (j < n - 1 && H[j + 1] > H[j]) {
					j = j + 1;
				}
				if (v >= H[j]) {
					heap = true;
				} else {
					H[k] = H[j];
					k = j;
				}
			}
			H[k] = v;
		}
		return H;
	}
	
	public void heapSort(int[] H) {
		int lastPosition = H.length;
		while(lastPosition > 0) {
			H = heapify(H, lastPosition);
			// Max Deletion Step
			int temp = H[lastPosition-1];
			H[lastPosition-1] = H[0];
			H[0] = temp;
			lastPosition--;
		}
	}
}

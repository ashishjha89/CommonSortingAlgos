public class MergeSort {

	public void mergeSort(int[] ar, int startPos, int lastPos) {
		if (startPos >= lastPos) {
			return;
		}
		int mid = (startPos + lastPos) / 2;
		mergeSort(ar, startPos, mid);
		mergeSort(ar, mid + 1, lastPos);
		merge(ar, startPos, mid, lastPos);
	}

	public void merge(int[] ar, int startIndex, int mid, int lastIndex) {
		int[] leftArray = new int[mid - startIndex + 1];
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = ar[startIndex + i];
		}
		int[] rightArray = new int[lastIndex - mid];
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = ar[mid + i + 1];
		}
		int i = 0, j = 0;
		int index = startIndex;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				ar[index++] = leftArray[i++];
			} else {
				ar[index++] = rightArray[j++];
			}
		}
		while (j < rightArray.length) {
			ar[index++] = rightArray[j++];
		}
		while (i < leftArray.length) {
			ar[index++] = leftArray[i++];
		}
	}

}

public class Heap {
    public static void main(String[] args) {
        int arr[] = {73, 6, 57, 88, 60, 42, 83, 72, 48,85};
        Heap ob = new Heap();
        ob.sort(arr);
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for(int i = n / 2 - 1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[largest] < arr[left]) largest = left;
        if(right<n && arr[largest]<arr[right]) largest = right;
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);

        }
    }
}

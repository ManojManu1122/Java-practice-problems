public class Stock {
    public static boolean arrayTwice(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = { 7, 1, 5, 3, 7, 4 };
        System.out.println(arrayTwice(array));
    }
}

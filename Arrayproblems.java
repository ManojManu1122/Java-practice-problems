public class Arrayproblems {
    public static void main(String[] args) {
        int[][] arr = {{4,3,7},
                        {8,7,8},{1,2,3}};
        int searchValue = 7;
        // numberofElements(arr,searchValue);
        // sumOfNumbers(arr);
        transpose(arr);
    }

    private static void numberofElements(int[][] arr, int searchValue) {
        int row=arr.length,col=arr[0].length;
        int count =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==searchValue){
                    count = count+1;
                }
            }
        }
        System.out.println(searchValue + " present "+count+" times in array");
    }

    private static void sumOfNumbers(int[][] arr) {
        int row=arr.length,col=arr[0].length;
        int sum =0;
        for(int i=0;i<col;i++){
            sum+=arr[1][i];
        }
        System.out.println("Sum of 2nd row elements is: "+sum);
    }

    private static void transpose(int[][] arr) {
        int row = arr.length,col = arr[0].length;
        int[][] trans = new int[col][row];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i] = arr[i][j];
            }
        }

        for(int i =0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

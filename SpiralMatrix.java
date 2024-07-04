

public class SpiralMatrix {
    public static void main(String[] args) {
       int arr[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        printSpiralMatrix(arr); 
    }

    private static void printSpiralMatrix(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr.length-1;
        while(startRow<=endRow && startCol<=endCol){
        //Printing top
        for(int i = startCol;i<=endCol;i++){
            System.out.print(arr[startRow][i]+" ");
        }
        //printing right of the array
        for(int j=startRow+1;j<=endRow;j++){
            System.out.print(arr[j][endCol]+" ");
        }
        //printing bottom
        for(int i=endCol-1;i>=startCol;i--){
            System.out.print(arr[endRow][i]+" ");
        }
        //printing left
        for(int j=endRow-1;j>=startRow+1;j--){
            System.out.print(arr[j][startCol]+" ");
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
    System.out.println();
}
    
}

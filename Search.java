    
    
public class Search {
    public static void main(String[] args) {

    int arr[][] = {{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
    int key = 37;
    stairSearch(arr,key);
    }
    public static void stairSearch(int[][] arr, int key) {
        int row = 0,col = arr[0].length-1;

    while (row<arr.length && col>=0) {
        if(arr[row][col]==key){
            System.out.println(key +" found at :("+ row + "," + col +")");
            return;
        }
        else if(key>arr[row][col]){
            row++;
        }
        else{

            col--;
        }
    }
    System.out.println("Not found");

}
}
        

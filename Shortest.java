
public class Shortest {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
       System.out.print(shortestPath(str));
    }

    private static int shortestPath(String str) {
        int x = 0,y = 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
             //South
             if(dir == 'S') y--;
             //North
             if(dir=='N') y++;
             //East
             if(dir=='E') x++;
             //West
             if(dir=='W') x--;
        }
        int x2 = x*x;
        int y2 = y*y;
        return (int) Math.sqrt(x2+y2);
       
    }

    
}
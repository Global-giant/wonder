
/*1b) Nested loop*/
public class NigeriaFlagnextedLoop {
    public static void main(String[] args) {
        int height = 4; // Height of the flag
        int width = 12;  // Width of the flag

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 4 || j==5 ||j==6 || j==7) { 
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
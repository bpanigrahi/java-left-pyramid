package play;

public class Pyramid {

    public static void main(String[] args) {
        int sizeOfPyramid = 10;

        for (int i = 1; i <= sizeOfPyramid; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

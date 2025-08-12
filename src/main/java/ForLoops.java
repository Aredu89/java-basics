public class ForLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {

            for(int col = 1; col <= 5; col++) {
                int value = row * col;
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}

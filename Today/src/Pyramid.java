public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Print FullPyramidNumber");
        Pyramid obj1 = new Pyramid();
        obj1.Pyramid(4);
    }

    public void Pyramid(int rows) {
        int rowCount = 1;

        System.out.println("Pyramid Pattern: ");

        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();

            rowCount++;
        }
    }
}
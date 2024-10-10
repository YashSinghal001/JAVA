public class Pascal {


        public static void main(String[] args) {
            System.out.println("Print FullPyramidNumber");
            Pascal obj1 = new Pascal();
            obj1.Pascal(5);
        }

        public void Pascal(int rows) {
            for(int i = 1; i <= rows; ++i) {
                int num;
                for(num = 1; num <= rows - i; ++num) {
                    System.out.print("  ");
                }

                num = 1;

                for(int k = 1; k <= i; ++k) {
                    System.out.print("" + num + "  ");
                    num = num * (i - k) / k;
                }

                System.out.println();
            }

        }
    }

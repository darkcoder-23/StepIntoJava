package interview;

public class Singlelopp {
	public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int row = 1;
        int col = 1;

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);

            if (col == row) {
                System.out.println();
                row++;
                col = 0;
            }

            col++;
        }
    } 

}

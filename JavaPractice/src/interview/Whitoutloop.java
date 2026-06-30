package interview;

import java.util.Arrays;


public class Whitoutloop {
	public static void main(String[] args) {

        int[][] arr = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 0, 1}
        };

        Arrays.stream(arr)
                .forEach(row ->
                        Arrays.setAll(row, i -> row[i] == 0 ? 2 : 1)
                );

        System.out.println(Arrays.deepToString(arr));
    }

}

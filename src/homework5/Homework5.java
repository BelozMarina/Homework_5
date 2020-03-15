package homework5;

public class Homework5 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = i * j + 1;
            }

        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }


    }
}

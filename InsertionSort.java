public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {0, 1, 3, 6, 5, 4, 9, 7, 8, 2};

        System.out.printf("Insertion Sorting: ");

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}



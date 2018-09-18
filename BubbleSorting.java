public class BubbleSorting {

    public static void main(String[] args) {

        int[] array = {0, 1, 3, 6, 5, 4, 9, 7, 8, 2};

        int temp;
        System.out.printf("Bubble Sorting: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}

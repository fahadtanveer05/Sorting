public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {0, 1, 3, 6, 5, 4, 9, 8, 7, 2};

        System.out.printf("Selection Sorting: ");
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

                int cons = array[minIndex];
                array[minIndex] = array[i];
                array[i] = cons;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
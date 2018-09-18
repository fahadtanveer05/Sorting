public class ModifiedBubbleSorting {

    public static void main(String[] args) {

        int[] array = {0, 1, 3, 6, 5, 4, 9, 7, 8, 2};

        int temp;
        int flag = 0;

        System.out.printf("Modified Bubble Sorting: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.printf("Array already sorted %n");
                break;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
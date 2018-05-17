public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] > array[j]) {
                    a = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = a;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

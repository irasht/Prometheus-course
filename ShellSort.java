public class ShellSort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                int num = array[i];
                while (j >= increment && array[j - increment] > num) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = num;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}    

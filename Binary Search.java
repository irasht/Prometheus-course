public class BinarySearch {

    public static void main(String[] args) {
        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;
        int a=0;
        for (int i = 0; i < data.length; ++i) {
            if (numberToFind == data[i]) {
                a = i;
                break;
            }else{
                a=-1;
            }
        }
        System.out.print(a);
    }
}

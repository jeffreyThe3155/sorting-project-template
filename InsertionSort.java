public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i = 0; i < input.length - 1; i++) {
            //extra line to add stuff
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[i]) {
                    int smaller = input[j];
                    input[j] = input[i];
                    input[i] = smaller;
                }
            }
            //extra line to add stuff
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

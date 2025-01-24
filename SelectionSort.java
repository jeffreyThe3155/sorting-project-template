public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        for (int i = 0; i < input.length; i++) {
            int smallest = 0;
            int index = 0;
            
            for (int j = i + 1; j < input.length; j++) {
                smallest = Integer.MAX_VALUE;
                if (smallest > input[j]) {
                    smallest = input[j];
                    index = j;
                }
            }
            input[index] = input[i];
            input[i] = smallest;
        }
    }
}

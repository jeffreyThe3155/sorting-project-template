/*public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        for (int i = 0; i < input.length; i++) {
            int smallest = 0;
            int index = 0;
            
            for (int j = i; j < input.length; j++) {
                smallest = Integer.MAX_VALUE;
                if (smallest > input[j]) {
                    smallest = input[j];
                    index = j;
                }
            }
            input[index] = input[i];
            input[i] = smallest;
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}*/
public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int smallest = input[i];
                input[i] = input[index];
                input[index] = smallest;
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

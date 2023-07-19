public class MaxMinArrayElement {

    public static void main(String[] args) {
        int[] arr = {54, 546,1, 548, 60};
        findMaxMinElements(arr);
    }

    private static void findMaxMinElements(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

}

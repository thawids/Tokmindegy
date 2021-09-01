public class TeljesenMindegyMi {

    public static void main(String[] args) {

        int[] mindegyTomb = {34, 54, 634, 21, 423, 35, 73, 1, 90, 1, 55, 68, 37, 94, 61, 75, 88, 999, 843, 200};
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
}
    }

public class Test {
    public static void main(String[] args) {
        int arr[] = { 67, 54, 5, -1, 10, -10 };
        int arr2[] = { 67, 54, 32, 31, 0 };
        Sort.selection(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Sort {
    public static void bumble(int[] arr) {
        int length = arr.length;
        int maxIndex = 0;
        while (length != 0) {
            maxIndex = 0;
            for (int i = 1; i < length; i++) {
                if (arr[i] < arr[maxIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = temp;
                }
                maxIndex = i;
            }

            length = maxIndex;
        }
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // declaracion pivot
        int pivot = arr[(start + end) / 2];
        // desplazar pivot al inicio
        int temp = arr[start];
        arr[start] = pivot;
        arr[(start + end) / 2] = temp;
        // declaracion izq y der
        int left = start + 1;
        int right = end;
        // parar cuando se encuentren
        while (left <= right) {
            // buscar elementos mal colocados
            while (left <= end && arr[left] < pivot) {
                left++;
            }

            while (right > start && arr[right] >= pivot) {
                right--;
            }
            // hacemos el swap
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // colocar el pivot
        if (right > start) {
            temp = arr[start];
            arr[start] = arr[right];
            arr[right] = temp;
        }
        // recursiva para la izquierda y derecha
        quicksort(arr, start, right - 1);
        quicksort(arr, right + 1, end);
    }

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // insertar el key en el "subarray"
            int key = arr[i];
            int j = i - 1;
            // desplazar una posicion para elementos mayores que key a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // insertar key en su pos correcta
            arr[j + 1] = key;
        }
    }
}

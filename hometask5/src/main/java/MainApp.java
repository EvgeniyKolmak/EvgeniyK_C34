import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        // Задание: 1
        // Дан одномерный массив целых чисел. Необходимо получить второй, который будут зеркальной копией первого (элементы наоборот - с последнего до первого)
        System.out.println("\nTask 1:");

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverseArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }

        System.out.println("\tOriginal array -> " + Arrays.toString(arr) +
                "\n\tReverse array -> " + Arrays.toString(reverseArr)
        );


        // Задание: 2
        // Дан массив целых чисел. Необходимо удалить элемент, расположенный по середине.
        System.out.println("\nTask 2:");

        int[] arr2 = new int[] {1, 2, 3, 4, 5};
        int[] newArr = new int[arr2.length - 1];

        for (int i = 0, j = 0; i <= arr2.length - 1; i++) {
            if (i == arr2.length/2) {
                continue;
            }

            newArr[j] = arr2[i];
            j++;
        }

        System.out.printf("\tOld array -> " + Arrays.toString(arr2) +
                "\n\tThe number %d has been deleted" +
                "\n\tNew array -> " + Arrays.toString(newArr) + "\n",
                 arr2[arr2.length/2]
        );

        // Задание: 3
        // Даны два массива целых чисел. Необходимо найти все элементы (собрать из них массив) которые не встречаются в обоих массивах одновременно.
        System.out.println("\nTask 3:");

        int[] array1 = new int[] {7, 6, 6, 9, 4, 3, 4, 1, 3, 1};
        int[] array2 = new int[] {8, 2, 1, 0, 1, 0, 5, 3, 2, 4};
        int[] tempArray = new int[array1.length + array2.length];

        Arrays.sort(array1);
        Arrays.sort(array2);

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                tempArray[count] = array1[i];
                count++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                tempArray[count] = array2[i];
                count++;
            }
        }

        int[] uniqArray = new int[count];

        for (int i = 0; i < count; i++) {
            uniqArray[i] = tempArray[i];
        }

        Arrays.sort(uniqArray);

        System.out.println("\tArray 1 -> " + Arrays.toString(array1) +
                "\n\tArray 2 -> " + Arrays.toString(array2) +
                "\n\tResult array -> " + Arrays.toString(uniqArray)
        );


        // Задание: 4
        // Дан массив целых чисел с дублирующими элементами. Необходимо найти элемент, который встречается максимальное число раз
        System.out.println("\nTask 4:");

        int[] array4 = new int[]{7, 6, 6, 9, 4, 3, 6, 4, 1, 3, 1};

        Arrays.sort(array4);

        int elem = 0;
        int index = 0;

        for (int i = 0; i < array4.length; i++) {
            int innerIndex = 0;
            for (int j = 0; j < array4.length; j++) {
                if (array4[i] == array4[j]) {
                    innerIndex++;
                }
            }

            if (innerIndex > index) {
                index = innerIndex;
                elem = array4[i];
            }
        }

        System.out.printf("\tArray -> " + Arrays.toString(array4) +
                "\n\tThe number '%d' occurs the maximum number of times (%d)\n", elem, index);
    }
}

package task1;

public class Calculator {
    public int calcArrayLength(int[] array) {
        return array.length;
    }

    public int findFirstOccurrenceIndex(int[] array, int el) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public boolean elementExistsInArray(int[] array, int el) {
        for (int currentEl : array) {
            if (currentEl == el) {
                return true;
            }
        }
        return false;
    }
}

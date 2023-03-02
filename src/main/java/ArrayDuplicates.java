public class ArrayDuplicates {

    public static String[] removeDuplicates(String[] array) {
        String[] nonDuplicateArray;
        int finalLength = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (j >= finalLength) {
                    break;
                }
                if (array[i].equals(array[j])) {
                    finalLength--;
                    int shiftPosition = j;
                    for (int k = j + 1; k < array.length; k++) {
                        array[shiftPosition] = array[k];
                        shiftPosition++;
                    }
                    j--;
                }
            }
        }
        nonDuplicateArray = new String[finalLength];
        for (int i = 0; i < finalLength; i++) {
            nonDuplicateArray[i] = array[i];
        }
        return nonDuplicateArray;
    }
}

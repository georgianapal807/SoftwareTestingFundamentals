import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayDuplicatesTest {
    @Test
    void testEmptyArray() {
        String[] emptyArray = {};
        Assertions.assertThat(ArrayDuplicates.removeDuplicates(emptyArray)).isEmpty();
    }

    @Test
    void arrayHasNoDuplicate() {
        String[] array = {"ana", "are", "mere"};
        Assertions.assertThat(ArrayDuplicates.removeDuplicates(array)).isEqualTo(array);
    }

    @Test
    void arrayHasDuplicate() {
        String[] firstArray = {"ana", "ana", "are", "mere"};
        String[] secondArray = {"ana", "are", "mere"};
        Assertions.assertThat(ArrayDuplicates.removeDuplicates(firstArray)).isEqualTo(secondArray);
    }

    @Test
    void arrayHasTwoDuplicates() {
        String[] firstArray = {"a", "a"};
        String[] secondArray = {"a"};
        Assertions.assertThat(ArrayDuplicates.removeDuplicates(firstArray)).isEqualTo(secondArray);
    }
}

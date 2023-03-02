import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJLibraryTest {

    @Test
    void shouldAddTwoNumbers() {
        int result = 10 + 15;
        Assertions.assertThat(result).isEqualTo(25).withFailMessage("The sum is not correct");
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int result = 3 * 3;
        Assertions.assertThat(result)
                .isPositive()
                .isEqualTo(9)
                .isGreaterThan(7)
                .isLessThan(12)
                .isBetween(7, 10)
                .isNotEqualTo(10);
    }

    @Test
    void testStringValue() {
        String text = "this is the new message";
        String empty = "";
        String blank = " ";
        Assertions.assertThat(text)
                .contains("new")
                .isSubstringOf("this is the new message of our first SoftwareTesting course.")
                .isLowerCase();
    }
}

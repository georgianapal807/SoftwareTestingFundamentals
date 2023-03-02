import org.junit.jupiter.api.*;

public class SimpleTest {

    @Test
    @DisplayName("Custom name")
        //adnonarea Test
    void firstTest() {  //este o metoda cu default - 4 tipuri:default, public, protected si private
        System.out.println("Executing first test ...");
    }

    @Test
    @Disabled
    void secondTest() {
        System.out.println("Executing second test ...");
    }

    @BeforeEach
    void init() {
        System.out.println("This is executing before each test method");
    }

    @AfterEach
    void tearUp() {
        System.out.println("This is executing after each test method");
    }

    @BeforeAll   //trebuie sa fie statice altfel nu functioneaza
    static void setUP() {
        System.out.println("This is executing once before execution of first test method");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("This is executing once after execution of the last test method");
    }

    @Test
    void testNotNull() {
        String text = "Text"; //given
        Assertions.assertNotNull(text, "The object is null"); //then
    }

    @Test
    void testNull() {
        String text = null;
        Assertions.assertNull(text, "The object is not null");
    }

    @Test
    void testAssertTrue() {
        Boolean value = true;
        Assertions.assertTrue(value, "The value is not true");
    }

    @Test
    void testAssertFalse() {
        Boolean value = false;
        Assertions.assertFalse(value, "The value is true");
    }

    @Test
    void testArrayEquals() {
        String[] firstArray = {"mar", "para"};
        String[] secondArray = {"mar", "para"};
        Assertions.assertArrayEquals(firstArray, secondArray, "The array are not equals");
    }

}

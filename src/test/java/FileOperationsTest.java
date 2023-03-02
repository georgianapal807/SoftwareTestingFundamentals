import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

class FileOperationsTest {

    private FileOperations objectToBeTested;

    @BeforeEach
    void init() {
        objectToBeTested = new FileOperations();
    }

    @Test
    void createFile() {
        File newFile = new File("Calculator");
        Assertions.assertThat(objectToBeTested.createFile("Calculator")).isEqualTo(newFile);
    }

    @Test
    void write() {
        String newText = "Un nou text adaugat";
        Assertions.assertThat(objectToBeTested.write("Un nou text adaugat")).isEqualTo(newText);
    }

    @Test
    void read() {
        FileOperations fileOperationsForReadTest = new FileOperations("Un anume text deja scris");
        Assertions.assertThat(fileOperationsForReadTest.read()).isEqualTo("Un anume text deja scris");
    }

    @AfterEach
    void clean() {
        objectToBeTested = null;
    }

}
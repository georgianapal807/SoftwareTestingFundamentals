import java.io.File;

public class FileOperations {

    private StringBuilder existingData;

    public FileOperations() {
        this.existingData = new StringBuilder();
    }

    public FileOperations(String existingData) {
        this.existingData = new StringBuilder(existingData);
    }

    public File createFile(String fileName){
        return new File(fileName);
    }

    public String write(String newText){
        existingData.append(newText);
        return existingData.toString();
    }

    public String read(){
        return existingData.toString();
    }

}
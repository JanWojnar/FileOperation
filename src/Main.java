import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String filePath = "/home/erfy_ubuntu/Desktop/Java_Projects/18022022_OperacjeNaPlikach/SavedData/Text1";
        String data = "Data 123\nData 456\nData 789";

        //WriteReadOperations.WriteTextToLocation(filePath,data);
        WriteReadOperations.ReadTextFromLocation(filePath);
    }
}

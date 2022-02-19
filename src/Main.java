import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String filePath1 = "/home/erfy_ubuntu/Desktop/Java_Projects/18022022_OperacjeNaPlikach/SavedData/Text1";
        String data = "Data 123\nData 456\nData 789";

        String filePath2 = "/home/erfy_ubuntu/Desktop/Java_Projects/18022022_OperacjeNaPlikach/SavedData/TextBin1";
        int dataBin = 123;

        //WriteReadOperations.WriteTextToLocation(filePath1,data);
        //WriteReadOperations.ReadTextFromLocation(filePath1);
        WriteReadOperations.WriteBinaryIntegerToLocation(filePath2,dataBin);
        WriteReadOperations.ReadBinaryIntegerFromLocation(filePath2);

    }
}

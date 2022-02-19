import javax.xml.stream.events.EndDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteReadOperations {

    public static void WriteTextToLocation(String location, String text) throws java.io.IOException{

        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(location);
            fileWriter.write(text);
        }finally{
            if(fileWriter != null){
                fileWriter.close();
            }
        }
    }
    public static void ReadTextFromLocation(String location) throws java.io.IOException{
        BufferedReader fileReader = null;
        String readText="",nextLine="";
        try{
            fileReader = new BufferedReader(new FileReader(location));
            while(nextLine != null){
                nextLine = fileReader.readLine();
                if(nextLine != null){
                    readText += nextLine + "\n";
                }
            }
            System.out.println(readText);
        }finally{
            if(fileReader != null){
                fileReader.close();
            }
        }
    }
}

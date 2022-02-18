import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteReadOperations {

    public static boolean WriteTextToLocation(String location, String text) throws java.io.IOException{

        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(location);
            fileWriter.write(text);
        }finally{
            if(fileWriter != null){
                fileWriter.close();
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static boolean ReadTextFromLocation(String location) throws java.io.IOException{
        BufferedReader fileReader = null;
        String readText="";
        try{
            fileReader = new BufferedReader(new FileReader(location));
            readText = fileReader.readLine();
            System.out.println(readText);
        }finally{
            if(fileReader != null){
                fileReader.close();
                return true;
            }
            else{
                return false;
            }
        }
    }
}

import java.io.*;

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
    public static void WriteBinaryIntegerToLocation(String location, int number) throws IOException {

        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(location));
            outputStream.writeInt(number);
        }finally{
            if(outputStream!=null){
                outputStream.close();
            }
        }
    }
    public static void ReadBinaryIntegerFromLocation(String location) throws IOException {

        DataInputStream inputStream = null;
        int readNumber;
        try {
            inputStream = new DataInputStream(new FileInputStream(location));
            readNumber=inputStream.readInt();
            System.out.println(readNumber);
        }finally{
            if(inputStream!=null){
                inputStream.close();
            }
        }
    }
}

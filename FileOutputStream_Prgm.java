import java.io.*;

public class FileOutputStream_Prgm {
    public static void main(String[] args) {
        try(FileOutputStream fio = new FileOutputStream("output.text") ){
            String data = "Good morning!! \n Have a great day!!!!!";
            fio.write(data.getBytes());

        }catch(IOException ie){
            ie.getStackTrace();
        }
    }
    
}

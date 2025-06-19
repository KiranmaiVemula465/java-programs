import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStream_Prgm{
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.text")){
            int byteData;
            while((byteData = fis.read())!=-1){
                System.out.print((char)byteData);
            }
        }    catch (IOException ie){
        System.out.println("EXCEPTION CAUGHT");

    }
    }    
    }


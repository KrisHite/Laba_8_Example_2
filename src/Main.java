import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Main {
    public static void readAllByByte(InputStream in) throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte!=-1){
                System.out.print((char) oneByte);
            }else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            //Файл
            InputStream inFile = new FileInputStream("C:\\tmp\\text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
            //Интернет страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            //Массив типа Byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }catch (IOException e){
            System.out.print("Ошибка! " + e);
        }

    }
}
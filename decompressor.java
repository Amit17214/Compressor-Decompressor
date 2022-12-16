import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decompressor {
    public static void method(File file) throws IOException{
        String filedirectory=file.getParent();
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzip=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(filedirectory+"/Decompressed");

        byte[] buffer = new byte[1024];

        int len;

        while((len=gzip.read(buffer))!=-1){

        }
        gzip.close();
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws IOException{
        File path=new File("/user/Mr Wick/wallpaper/Testfile");
        method(path);
    }
}

package io.nspai.StreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {
    public static void main(String[] args) {
        byte[] bytes = new byte[128];
        int bytesLength = bytes.length;

        //Example use of InputStream methods

        try (FileInputStream fileInputStream = new FileInputStream(args[0]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {
            System.out.println("Bytes available : " + fileInputStream.available());
            int count = 0;
            int read = 0;
            while ((read = fileInputStream.read(bytes)) != -1 ){
                if (read < bytesLength) fileOutputStream.write(bytes, 0, read);
                else fileOutputStream.write(bytes);
                count += read;
            }
            System.out.println(("Wrote : " + count));
        } catch (FileNotFoundException f) {
            System.out.println("File Not Found " + f);
        }catch (IOException e){
            System.out.println("IOException : " +e);
        }
    }
}


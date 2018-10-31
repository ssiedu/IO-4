package inputoutputexamples;

import java.io.FileOutputStream;

public class OSDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("e:/java4/info.txt");
        //FileOutputStream fos=new FileOutputStream("e:/java4/info.txt",true);
        
        String s="this data we storing to file using java code";
        byte b[]=s.getBytes();
        //writing multiple bytes together
        //fos.write(b);
        //writing part of byte array
        fos.write(b, 0, 10);
        
        
        /*
        //writing byte-by-byte
        fos.write(107);
        fos.write(108);
        fos.write(109);
        fos.write(110);
        fos.write(111);
        */
        fos.close();
        System.out.println("Data Stored");
        
    }
    
}

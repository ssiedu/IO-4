package inputoutputexamples;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SISDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1=new FileInputStream("e:/java4/Demo.java");
        FileInputStream fis2=new FileInputStream("e:/java4/Test.java");
        SequenceInputStream sis=new SequenceInputStream(fis2, fis1);
        int n;
        while((n=sis.read())!=-1){
            System.out.print((char)n);
        }
        sis.close();
        fis1.close();
        fis2.close();
    }
}

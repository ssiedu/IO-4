package inputoutputexamples;

import java.io.FileInputStream;

public class ISDemo {
    public static void main(String[] args) throws Exception{
        //reading the file data.txt
        
        //1. open a stream 
        FileInputStream fis=new FileInputStream("e:/java4/Test.java");
        //2. read the contents from stream
        //reading multiple bytes
        
        int n=fis.available();
        byte b[]=new byte[n];
        fis.read(b);
        
        String s=new String(b);
        
        System.out.println(s);
        
        /*
        //reading one-by-one bytes
        while(true){
        int n=fis.read();
        if(n==-1)break;
        System.out.print((char)n);
        }
        */
    }
    
}

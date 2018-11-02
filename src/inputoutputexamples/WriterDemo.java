package inputoutputexamples;

import java.io.FileWriter;

public class WriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("e:/java4/info.txt");
        
        String s="something to write to a file";
        //fw.write(s);
        fw.write(s, 5,10);
        //char ch[]={'a','b','c','d','e','f'};
        //fw.write(ch);
        fw.close();
        System.out.println("Data Stored");
    }
        
}
/*
    Writer  (parent class for all char based output streams)
    ---------
    void write(char[])
    void write(String)
    void write(String,int,int)
    void flush()
    void close()
*/
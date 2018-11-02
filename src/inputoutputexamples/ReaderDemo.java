package inputoutputexamples;

import java.io.FileReader;

public class ReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("e:/java4/info.txt");
        char ch[]=new char[10];
        fr.read(ch);
        for(char tmp:ch){
            System.out.println(tmp);
        }
    }
    
}

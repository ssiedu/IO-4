package inputoutputexamples;


import java.io.FileInputStream;

public class IOSkipDemo {
public static void main(String[] args) throws Exception {
   FileInputStream fis=new FileInputStream("e:/java4/data.txt");
   System.out.println((char)fis.read());//A
   System.out.println((char)fis.read());//B
   System.out.println((char)fis.read());//C->D
   fis.skip(3);//D,E,F->G
   System.out.println((char)fis.read());//G
   System.out.println((char)fis.read());//H
   System.out.println((char)fis.read());//I
   System.out.println((char)fis.read());//J->K
   fis.skip(2);//K,L
   System.out.println((char)fis.read());//M
   System.out.println((char)fis.read());//N
   
   fis.close();
   
}
    
}

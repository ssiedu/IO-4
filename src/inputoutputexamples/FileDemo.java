package inputoutputexamples;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
     
        File f=new File("e:/java4/testing.bmp");
        boolean b=f.createNewFile();
        System.out.println(b);
        
        /*
        File f1=new File("e:/java4/info.txt");
        File f2=new File("e:/java4/data.txt");
        boolean res=f1.renameTo(f2);
        */
        
        /*
        File f=new File("e:/java4/aaa/bbb");
        boolean res=f.mkdir();
        */
        /*
                
        File f=new File("e:/java4/aaa");
        boolean res=f.delete();
        */
        /*
        if(res==true){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
        */
        
        /*
        File f=new File("e:/java4");
        String s[]=f.list();
        
        for(String tmp:s){
            System.out.println(tmp);
        }
        */
        /*
        File f=new File("e:/java4/Demo.java");
        long v=f.lastModified();
        System.out.println(v);
        java.util.Date dt=new java.util.Date(v);
        System.out.println(dt);
        */
        
        
        //boolean b=f.exists();
        //boolean b=f.isFile();
        //boolean b=f.isDirectory();
        //boolean b=f.isHidden();
        //boolean b=f.canWrite();
        //System.out.println(b);
        
        
        
        //long v=f.length();
        //System.out.println("SIZE OF  FILE : "+v);
    }
    
}
/*
    File-Class-Methods  (non-static)
    ---------------------------------
    
    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()


    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    boolean isHidden()
    boolean canWrite()
    long lastModified()

*/

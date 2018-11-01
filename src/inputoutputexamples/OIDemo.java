package inputoutputexamples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class OIDemo{

    public static void main(String[] args) throws Exception{
        
        //reading an object from file (studobj.txt)
        
        FileInputStream fis=new FileInputStream("e:/java4/studobj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Stud s=(Stud)ois.readObject();
        s.show();
        
        
        
    }
    
}

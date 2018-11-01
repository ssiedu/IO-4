package inputoutputexamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OODemo {
    public static void main(String[] args) throws Exception {
        Stud s=new Stud(1001, "ABCD", "CS", 4);
        s.show();
        System.out.println("Preserve The Object : ");
        FileOutputStream fos=new FileOutputStream("e:/java4/studobj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close(); fos.close();
        System.out.println("Information Saved");
    }
    
}

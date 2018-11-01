package inputoutputexamples;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DODemo {
    public static void main(String[] args) throws Exception{

        int eno=1001;
        double sal=56500.55;
        boolean married=true;
        
        FileOutputStream fos=new FileOutputStream("e:/java4/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(eno);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        dos.close(); 
        fos.close();
        System.out.println("Data Stored");
    }
}

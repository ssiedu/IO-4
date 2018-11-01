package inputoutputexamples;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DIDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("e:/java4/empinfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        System.out.println("Eno : "+v1);
        System.out.println("Sal : "+v2);
        System.out.println("MSt : "+v3);
        dis.close();
        fis.close();
    }

}

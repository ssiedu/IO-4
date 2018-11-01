package inputoutputexamples;

import java.io.Serializable;

public class Stud implements Serializable{

    int rno;
    String name;
    String branch;
    transient int sem;

    public void show(){
        System.out.println("______________________________");
        System.out.println("Roll No  : "+rno);
        System.out.println("Name     : "+name);
        System.out.println("Branch   : "+branch);
        System.out.println("Semester : "+sem);
        System.out.println("______________________________");
    }
    public Stud(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    
    
    
}

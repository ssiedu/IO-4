package inputoutputexamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KBInput {
public static void main(String args[]) throws Exception {
InputStreamReader reader=new InputStreamReader(System.in);    
BufferedReader br=new BufferedReader(reader);

System.out.println("What is your Name : ");
String name=br.readLine();
System.out.println("What is your Age : ");
int age=Integer.parseInt(br.readLine());
System.out.println("Welcome : "+name);
System.out.println("You Are "+age+ " years old");
    
    
}    
}

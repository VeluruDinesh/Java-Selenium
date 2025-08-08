package FileOperation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;

public class FileHanding {

	public static void main(String[] args) throws IOException {
	File file=new File("./file.txt");
	if(!file.exists());
	 file.createNewFile();
 /*FileInputStream f=new FileInputStream(file);
	 int word;
	 while((word=f.read())!=-1) {
		 System.out.print((char)word);
		 
		 
	 }
	 f.close();*/
	 
 /*BufferedReader bufferReader=new BufferedReader(new FileReader(file));
 String Line;
 while((Line=bufferReader.readLine())!=null) {
	 System.out.println(Line);
 }
 bufferReader.close();*/
	/*BufferedWriter bufferwriter=new BufferedWriter(new FileWriter(file));
	bufferwriter.write("hi dinesh");
	bufferwriter.newLine();
	bufferwriter.write("hi varun");
	bufferwriter.close();
	BufferedReader bufferReader=new BufferedReader(new FileReader(file));
	 String Line;
	 while((Line=bufferReader.readLine())!=null) {
		 System.out.println(Line);
	 }
	 bufferReader.close();
	/* Scanner sc=new Scanner(file);
	 sc.nextLine();
	 sc.hasNext();
	 sc.close();*/
	 
	}

}

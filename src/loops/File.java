package loops;
import java.util.Scanner;

public class File {
	String File1;
	String File2;
	String File3;
	String File4;
	
	Scanner name=new Scanner(System.in);
	
void upload() {
	System.out.println("Enter the File to uplode");
    File4=name.nextLine();
	System.out.println("YOUR FILE "+ File4+" HAS BEEN SUCCESSFULLY UPLAODED");
	
}
void Download() {
	System.out.println("Enter the File name to download");
	String File_name=name.nextLine();
	System.out.println("YOUR FILE "+File_name+" HAS BEEN SUCCESSFULLY DOENLOADED");
	
}
void display() {
	System.out.println("file1 : "+File1);
	System.out.println("file2 : "+File2);
	System.out.println("file3 : "+File3);
	System.out.println("file4 : "+File4);
}

	public static void main(String[] args) {
		File f=new File();
		f.File1="photos";
		f.File2="details";
		f.File3="certificates";
		f.upload();
		f.display();
		f.Download();
		f.display();
	}

}

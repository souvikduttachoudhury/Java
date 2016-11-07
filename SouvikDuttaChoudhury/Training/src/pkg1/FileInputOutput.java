package pkg1;
import java.io.*;
public class FileInputOutput{
	public static void main(String args[]) throws IOException{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try {
	         fin = new FileInputStream("input.txt");
	         fout = new FileOutputStream("output.txt");
	         
	         int c;
	         while ((c = fin.read()) != -1) {
	            fout.write(c);
	         }
	      }finally {
	         if (fin != null) {
	            fin.close();
	         }
	         if (fout != null) {
	            fout.close();
	         }
	      }
	}
}

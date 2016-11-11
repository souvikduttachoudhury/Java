package pkg1;
import java.io.*;
public class FileIO{
public static void main(String args[]) throws IOException{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try {
	         fin = new FileInputStream("C:\\Users\\Souvik.p\\Documents\\My Java\\Training\\src\\pkg1\\input.txt");
	         fout = new FileOutputStream("C:\\Users\\Souvik.p\\Documents\\My Java\\Training\\src\\pkg1\\output.txt");
	         
	         int c;
	         while ((c = fin.read()) != -1) {
	            fout.write(c);
	         }
	      }
		finally {
	         if (fin != null) {
	            fin.close();
	         }
	         if (fout != null) {
	            fout.close();
	         }
	      }
	}
}

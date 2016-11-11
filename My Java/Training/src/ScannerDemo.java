import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {

		   //String s = "Hello World! \n 3 + 3.0 = 6.0 true ";

		   // create a new scanner with the specified String Object
		   Scanner scanner = new Scanner(System.in);
		   scanner.useDelimiter(System.getProperty("line.separator"));

		   // print the next line
		   String a="Ankita";
		   int k=scanner.nextInt();
		   String b=scanner.next();
		   System.out.println(a.concat(b)+"   "+k);

		   // close the scanner
		   scanner.close();
		   }
}

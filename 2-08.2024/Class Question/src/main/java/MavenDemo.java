import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class MavenDemo {
  public static void main(String []args) throws FileNotFoundException
  {
	  FileInputStream input;
	  FileOutputStream output;
	  
	  input  = new FileInputStream("D:\\REVATURE Practice\\\\hello.txt");
	  output = new FileOutputStream("D:\\REVATURE Practice\\\\hello1.txt");
	  
	  
  }
}

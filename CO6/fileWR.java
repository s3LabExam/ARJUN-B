import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class fileWR
{
public static void main(String[] args)
{
try
{
FileWriter fw=new FileWriter("C:\\Users\\ARJUN B\\Desktop\\S2\\JAVA\\a",true);
fw.write("welcome to programming");
fw.close();
FileReader reader = new FileReader("C:\\Users\\ARJUN B\\Desktop\\S2\\JAVA\\a");
BufferedReader b= new BufferedReader(reader);
String line;
System.out.println("\n Data Read From The File \n");
while ((line = b.readLine()) != null)
{
System.out.println(line);
}
reader.close();
}
catch (IOException e)
{
System.out.println("\n Error Occured...");
}
}
}
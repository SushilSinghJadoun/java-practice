import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ArrayListSerializable
{
	public static void main(String... args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		try
		{
			FileOutputStream fos=new FileOutputStream("myfile.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			System.out.println("After deserialization");
			FileInputStream fin=new FileInputStream("myfile.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			ArrayList al1=(ArrayList)oin.readObject();
			System.out.println(al1);
		}catch(Exception ioe)
		{
			ioe.printStackTrace();
		}
	}
}
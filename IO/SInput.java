import java.io.*;
import java.util.*;
class SInput 
{
	public static void main(String[] args)throws IOException
	{
		//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"));
		SequenceInputStream sin=new SequenceInputStream(new MyEnum());
		
		DataInputStream din=new DataInputStream(sin);
		String s="";
		while(s!=null)
		{
			s=din.readLine();
			if(s!=null)
				System.out.println(s);
		}
		din.close();
	}
}
class MyEnum implements Enumeration
{
	InputStream in[];
	int i=0;
	MyEnum()
	{
		try
		{
			in=new InputStream[]{new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"),new FileInputStream("lalu.txt")};
		}catch(Exception e){}
	}
	public boolean hasMoreElements()
	{
		System.out.println("hasMoreElement");
		if(i<in.length)
			return true;
		else 
			return false;
	}
	public Object nextElement()
	{
		System.out.println("nextElement");
		return in[i++];
	}
}
import java.io.*;
class DataStream2{
	public static void main(String[] args)throws IOException{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("lalu.txt");
		PrintStream dout=new PrintStream(fout);
		String s="ssssssss";
		while(!s.equals("stop")){
			s=din.readLine();
			dout.println(s);
		}din.close();
		dout.close();
	}
}

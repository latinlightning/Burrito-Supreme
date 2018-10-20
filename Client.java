package Messaging;
import java.io.*;
import java.net.*;


public class Client {
	public static void main(String[] args) {
		try {
			
			Socket s = new Socket ("127.0.0.1", 1201); // server ip and port
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStreatm (s.getOutputStream());
			
			BufferReader br = new BufferedReader (new InputStreamReader(System.in));
			String msgin= "", msgout="";
			while(!msgin.equals("end")) {
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readtUTF();
				System.out.println(msgin);
				
				}
			} catch (Exception e) {
			  //handle exceptions here
		}

	}

}

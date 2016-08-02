import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
public class RemoteDroidServer {
	
	private static ServerSocket server = null;
	private static Socket client = null;
	private static BufferedReader in = null;
	private static String line;
	private static boolean isConnected=true;
	private static Robot robot;
	private static final int SERVER_PORT = 8998;

	public static void main(String[] args) {
		boolean leftpressed=false;
		boolean rightpressed=false;
 		double epsilon=0.57;
	    try{
	    		robot = new Robot();
			server = new ServerSocket(SERVER_PORT); //Create a server socket on port 8998
			
			client = server.accept(); //Listens for a connection to be made to this socket and accepts it
						
			in = new BufferedReader(new InputStreamReader(client.getInputStream())); //the input stream where data will come from client
			
		}catch (IOException e) {
			System.out.println("Error in opening Socket");
			System.exit(-1);
		}catch (AWTException e) {
			System.out.println("Error in creating robot instance");
			System.exit(-1);
		}

		//read input from client while it is connected  aaabcbaacbacbabccbaacbbbbbbbabcabcabcabcaaaaabcabcabcabc
	    while(isConnected){
	        try{
			line = in.readLine(); 
			System.out.println(line); 
			
			if(line.equalsIgnoreCase("A")){
				robot.keyPress(KeyEvent.VK_A);
				// robot.keyRelease(KeyEvent.VK_A);
			}
			else if(line.equalsIgnoreCase("B")){
				robot.keyPress(KeyEvent.VK_B);
				// robot.keyRelease(KeyEvent.VK_B);
			}
			else if(line.equalsIgnoreCase("C")){
				robot.keyPress(KeyEvent.VK_C);
				// robot.keyRelease(KeyEvent.VK_C);
			}
			else if(line.equalsIgnoreCase("D")){
				robot.keyPress(KeyEvent.VK_D);
				// robot.keyRelease(KeyEvent.VK_D);
			}
			else if(line.equalsIgnoreCase("E")){
				robot.keyPress(KeyEvent.VK_E);
				// robot.keyRelease(KeyEvent.VK_E);
			}
			else if(line.equalsIgnoreCase("F")){
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
			}
			else if(line.equalsIgnoreCase("G")){
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
			}
			else if(line.equalsIgnoreCase("H")){
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
			}
			else if(line.equalsIgnoreCase("I")){
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
			}
			else if(line.equalsIgnoreCase("J")){
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
			}
			else if(line.equalsIgnoreCase("K")){
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
			}
			else if(line.equalsIgnoreCase("L")){
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
			}
			else if(line.equalsIgnoreCase("M")){
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
			}
			else if(line.equalsIgnoreCase("N")){
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
			}
			else if(line.equalsIgnoreCase("O")){
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
			}
			else if(line.equalsIgnoreCase("P")){
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
			}
			else if(line.equalsIgnoreCase("Q")){
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
			}
			else if(line.equalsIgnoreCase("R")){
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
			}
			else if(line.equalsIgnoreCase("S")){
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
			}
			else if(line.equalsIgnoreCase("T")){
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
			}
			else if(line.equalsIgnoreCase("U")){
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
			}
			else if(line.equalsIgnoreCase("V")){
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
			}
			else if(line.equalsIgnoreCase("W")){
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
			}
			else if(line.equalsIgnoreCase("X")){
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
			}
			else if(line.equalsIgnoreCase("Y")){
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
			}
			else if(line.equalsIgnoreCase("Z")){
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
			}
			else if(line.equalsIgnoreCase("LEFT_ARROW")){
				robot.keyPress(KeyEvent.VK_LEFT);
				robot.keyRelease(KeyEvent.VK_LEFT);
			}
			else if(line.equalsIgnoreCase("RIGHT_ARROW")){
				robot.keyPress(KeyEvent.VK_RIGHT);
				robot.keyRelease(KeyEvent.VK_RIGHT);
			}
			else if(line.equalsIgnoreCase("UP_ARROW")){
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyRelease(KeyEvent.VK_UP);
			}
			else if(line.equalsIgnoreCase("DOWN_ARROW")){
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
			}
			else if(line.equalsIgnoreCase("SPACE")){
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
			}/*
			else if(line.equalsIgnoreCase("BACKSPACE")){
				robot.keyPress(KeyEvent.VK_BACKSPACE);
				robot.keyRelease(KeyEvent.VK_BACKSPACE);
			}*/
			else if(line.equalsIgnoreCase("ENTER")){
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			else if(line.equalsIgnoreCase("SHIFT")){
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}/*
			else if(line.equalsIgnoreCase("CTRL")){
				robot.keyPress(KeyEvent.VK_CTRL);
				robot.keyRelease(KeyEvent.VK_CTRL);
			}*/
			else if(line.equalsIgnoreCase("ALT")){
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyRelease(KeyEvent.VK_ALT);
			}

			if(line.equalsIgnoreCase("rmb")){
				System.out.println("rmb");
				robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);		        	
			}

			else if(line.equalsIgnoreCase("lmb")){
				System.out.println("lmb");
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			}
			//input will come in x,y format if user moves mouse on mousepad
			else if(line.contains(",")){
				float movex=Float.parseFloat(line.split(",")[0]);//extract movement in x direction
				float movey=Float.parseFloat(line.split(",")[1]);//extract movement in y direction

				Point point = MouseInfo.getPointerInfo().getLocation(); //Get current mouse position
				float nowx=point.x;
				float nowy=point.y;

				if(Math.abs(movex)+Math.abs(movey)<epsilon){
					System.out.println("lmb");
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);		
				}
				else{
					robot.mouseMove((int)(nowx+movex),(int)(nowy+movey));//Move mouse pointer to new location									
				}
			}
			//if user taps on mousepad to simulate a left click
			else if(line.contains("left_click")){
				//Simulate press and release of mouse button 1(makes sure correct button is pressed based on user's dexterity)
				System.out.println("Left Click");
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			}
			//Exit if user ends the connection
			else if(line.equalsIgnoreCase("exit")){
				isConnected=false;
				//Close server and client socket
				server.close();
				client.close();
			}

	        } catch (IOException e) {
				System.out.println("Read failed");
				System.exit(-1);
	        }
      	}
	}
}
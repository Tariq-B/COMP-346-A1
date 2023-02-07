/*
*
* OVERALL PROBLEMS
* 1- You'll need to touch more than that, look for TODO in the code
* 2- Read up on the Thread class
*
*
* should network/client/server extend Thread yes
*
* You need to complete the Java program that is provided by implementing 4
threads so that the client, the server and the network all run concurrently. The
client has 2 threads, one for sending the transactions and another for receiving
the completed transactions.
In case the input and output network buffers are full or empty each client or
server thread must yield the cpu using the Java method Thread.yield(). The
network thread executes an infinite loop that ends when both client and server
threads have disconnected. In case the client or sever threads are still connected
the network thread must continuously yield the cpu.
*
* You must record the running times of both client threads and the server thread
using the Java method System.currentTimeMillis().
*
* You need to provide output test cases with the appropriate running times for the
client and the server threads. Change the size of the network buffers from 10 to
20 and explain why (if any) there is a significant difference in the running times.
*
*
*
* public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
*
*
*/

/**
 *
 * @author Tariq Benmouh
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        Server objServer = new Server();        
        /* Complete here the code for the main method ...*/
    }
}

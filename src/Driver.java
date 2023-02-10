

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
        objServer.start();
        Client client1 = new Client("sending");
        client1.start();
        Client client2 = new Client("receiving");
        client2.start();
        /* Complete here the code for the main method ...*/
    }
}

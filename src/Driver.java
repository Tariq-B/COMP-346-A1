

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
        
    	Network objNetwork = new Network("network");             /* Activate the network */
        objNetwork.start();
        Server objServer = new Server();                                /* Activate the server */
        objServer.start();
        Client client1 = new Client("sending");                /* Activate the sending client */
        client1.start();
        Client client2 = new Client("receiving");              /* Activate the receiving client */
        client2.start();

        // to not be zombie threads (might not be needed)
        /*try {
        objServer.join();
        client1.join();
        client2.join();
        objNetwork.join();}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

    }
}

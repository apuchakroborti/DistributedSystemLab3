/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_multiple_client;

import java.util.Scanner;

/**
 *
 * @author apu
 */
public class Server_Multiple_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("press 1.for client\npress 2.forserver\n");
	        Scanner sc = new Scanner(System.in);
	        int choose=sc.nextInt();
	        if(choose == 1){
                    new Client1();
	            //Client1 client = new Client1("127.0.0.1");
	            //client.StartClient();
	            //Client1 client = new Client1("127.0.0.1");
	            //client.doTask();
	            
                    
	        }
	        else{
                    while(true){
	            Server server2ob = new Server();
	            //server2ob.StartServer();
                    }
                //Server1 server2ob = new Server1();
	        //server2ob.SdoTask();
                }
        
        
    }
    
}

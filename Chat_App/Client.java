import java.net.*;
import java.io.*;
class Client
{

   Socket socket;
    BufferedReader br;
    PrintWriter out;
    public Client()
    {
        try{

            System.out.println("Sending Request to the Server");
            socket = new Socket("127.0.0.1",7777);
            System.out.println("Connection Done");

            br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out= new PrintWriter(socket.getOutputStream());

           startReading();
        startWritting();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void startReading()
     {
         Runnable r1 =()->{
            System.out.println("Reader Started..");
            try{
            while(true)
            {
                
                String msg = br.readLine();
                if(msg.equals("Exit"))
                {
                    System.out.println("Client terminated the chat");
                    socket.close();
                    break;
                }
                System.out.println("Server: " +msg);
               
            }
            }catch(Exception e){
                e.printStackTrace();
            }
         };
         new Thread(r1).start();
     }

     public void startWritting()
     {
          Runnable r2=()->{
            System.out.println("Writter Started");
            try{
             while(true && !socket.isClosed())
             {
               

                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();

                   
                    out.println(content);
                    out.flush();
                     if(content.equals("Exit"))
                    {
                        socket.close();
                        break;
                    }
                
             }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
          };
          new Thread(r2).start();

     }

    public static void main(String[] args)
    {
        System.out.println("This is Client");
        new Client();   
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class java_get {
    public static void main (String[]args)  {
        URL  url = new URL("https://jsonplaceholder.typicode.com/posts");
      HttpURLConnection connect = (HttpURLConnection) url.openConnection();
      connect.setRequestMethod("GET");

      connect.setRequestProperty("User-Agent","Chrome");
      int response = connect.getResponseCode();


      if(response==HttpURLConnection.HTTP_OK){
        BufferedReader read new BufferedReader( new InputStreamReader(connect.getInputStream()));
        StringBuffer str = new StringBuffer();
        String store = null;
        while (store= read.readLine())! = null {
            str.append(store);
        }
        read.close();
        System.out.println("Out get response", + str.toString());
      }
    }
}

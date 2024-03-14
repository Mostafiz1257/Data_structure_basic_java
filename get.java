import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class get {
    public static void main(String[] args) {
        URL url = new URL("google.com");
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        int response= connect.getResponseCode();

        connect.setRequestProperty("User_Agent","Chrome");
        if(response==HttpURLConnection.HTTP_OK){
         BufferedReader read  new BufferedReader(new InputStreamReader(connect.getInputStream()));
         StringBuffer str = new StringBuffer();
         String store = null;
         
        }

    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class testTest {
    

    public String testTest(String URL){
        try {
            URL url = new URL(URL);
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            //adding header
            httpURLConnection.setRequestProperty("Auth","Token");
            httpURLConnection.setRequestProperty("Data1","Value1");

            String line="";
            InputStreamReader inputStreamReader=new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder response=new StringBuilder();
            while ((line=bufferedReader.readLine())!=null){
                response.append(line);
            }
            bufferedReader.close();
            return "Response : "+response.toString();

        }
        catch (Exception e){
            return "Error in Making Get Request";
        }
    }



}

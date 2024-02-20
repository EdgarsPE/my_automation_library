package typeOfTests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class tryStressTest {
    public static void main(String[] args) {
        String url = "https://www.douglas.lv"; // Jūsu testējamā lapas adrese
        int numberOfRequests = 10; // Cik daudz pieprasījumu vēlaties veikt

        for (int i = 0; i < numberOfRequests; i++) {
            sendHttpRequest(url);
        }
    }

    private static void sendHttpRequest(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Iestatām pieprasījuma metodi
            connection.setRequestMethod("GET");

            // Izgūstam atbildes kodu
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Izgūstam atbildes saturu

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Varat apstrādāt atbildi pēc saviem vajadzībām
         //   System.out.println("Response: " + response.toString());

            // Atbrīvojam resursus
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

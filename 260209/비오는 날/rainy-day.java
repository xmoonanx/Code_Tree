import java.util.*;
import java.io.*;

class Forcast{
    String date, day, weather;

    public Forcast(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Forcast[] forcasts = new Forcast[n];
        String minDate = "9999-12-31";
        int cnt =0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();
            // Please write your code here.
            forcasts[i] = new Forcast(date, day, weather);
            if(weather.equals("Rain")) {
                if(minDate.compareTo(date) > 0) {
                    minDate = date;
                    cnt = i;
                }
            }
        }

        System.out.println(forcasts[cnt].date + " " + forcasts[cnt].day + " " + forcasts[cnt].weather);
    }
}
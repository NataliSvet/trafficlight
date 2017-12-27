import java.io.*;
public class trafficlight {
    public static void main(String[] args) throws Exception {
        // сколько раз можно ввести число.
        int n = 3;
        for (int i= 0; i < n; i++ ){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double t = Double.parseDouble(reader.readLine());
            String color = new String();

            t = t % 5;

            if (t >= 0 && t < 3){
                color = "зеленый";
            } else if (t >= 3 && t < 4){
                color = "желтый";
            } else if (t >= 4 && t < 5){
                color = "красный";
            }
            System.out.println(color);
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Integer> readIntegersFromCSV(String filePath) throws IOException {
        List<Integer> values = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            br.readLine(); //

            while ((line = br.readLine()) != null) {
                values.add(Integer.parseInt(line.trim()));
            }
        }

        return values;
    }
}

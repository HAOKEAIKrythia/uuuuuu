import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static String getTestData(String fileName) throws IOException {
        InputStream in = TestData.class.getClassLoader().getResourceAsStream(fileName);
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        List<String> list = new ArrayList<String>();
        String line = "";
        while ((line = br.readLine()) != null) { if (line.trim().length() > 1) { list.add(line); } }
        String listString = list.toString();
        return listString; }
}

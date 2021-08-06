import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URI uri = new URI("https://gist.githubusercontent.com/ThatHurleyGuy/53148d2d83b820ac1d5d2b78e9322a90/raw/9e882f9fefe44e6c6c4f80897f1f2d16cbbc5e1b/loan-payments.json");
        JSONTokener tokener = new JSONTokener(uri.toURL().openStream());
        JSONArray root = new JSONArray(tokener);
        System.out.println(root.toList().size());
    }
}

package urlFindChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URLfindChar {

    public static void main(String[] kanazawaShintenOmedetougozaimasu) throws IOException {
        System.out.println("URL入れまっし: "); //金沢弁
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputtedURL = bufferedReader.readLine();
        
        System.out.println("inputtedURL: " + inputtedURL);

    }

}

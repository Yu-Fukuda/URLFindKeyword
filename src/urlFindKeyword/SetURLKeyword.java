package urlFindKeyword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SetURLKeyword {

    static String url;
    static String keyword;
        
    static final String setURL() throws IOException{
        System.out.println("URL入れまっし: "); //金沢弁        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputtedURL = bufferedReader.readLine();
        return inputtedURL;
    }
    
    static final String setKeyword() throws IOException{
        System.out.println("検索するキーワードを入れまっし: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputtedKeyword = bufferedReader.readLine();
        return inputtedKeyword;
    }
}

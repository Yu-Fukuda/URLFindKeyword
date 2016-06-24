package urlFindKeyword;

import java.io.IOException;

public class URLfindKeyword {

    public static void main(String[] kanazawaShintenOmedetougozaimasu) throws IOException {
        
        final String inputtedURL = SetURLKeyword.setURL();
        
        final String inputtedKeyword = SetURLKeyword.setKeyword();
        
                
        System.out.println(inputtedKeyword + "を探すためにたどった経路");
        System.out.println(inputtedURL + "\n    ↓");
        
        //もし見つからなかったら、次のURL
        
        
    }

}

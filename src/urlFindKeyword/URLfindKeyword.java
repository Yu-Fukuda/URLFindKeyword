package urlFindKeyword;

import java.io.IOException;

public class URLfindKeyword {

    public static void main(String[] kanazawaShintenOmedetougozaimasu) throws IOException {
        
        String httpSource = SourceGetter.getSource() ;
        
                
        //System.out.println(keyword + "を探すためにたどった経路");
        //System.out.println(url + "\n    ↓");
        
        
        
        System.out.println("ソースの中身: " + httpSource);
    }

}

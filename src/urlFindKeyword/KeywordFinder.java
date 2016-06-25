package urlFindKeyword;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class KeywordFinder {
    static Boolean keywordFound () throws IOException{
        boolean mitsuketa = false;
        
        //final String inputtedKeyword = "facebook"; //テスト用
        String inputtedKeyword = SetURLKeyword.keyword;
        
        Pattern pattern = Pattern.compile(inputtedKeyword);
        
        String httpSource = SourceGetter.getSource();
        
         Matcher matcher = pattern.matcher(httpSource);
         
         if (matcher.find()) {            
            mitsuketa = true;
            
        } else {
            mitsuketa = false;
            
        }
        
        return mitsuketa;
        
    }
    

}

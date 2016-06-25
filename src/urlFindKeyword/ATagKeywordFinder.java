package urlFindKeyword;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ATagKeywordFinder {
    static Boolean keywordFound () throws IOException{
        Boolean mitsuketa = false;
        
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

    static ArrayList<String> aTagFilter () throws IOException{
        String httpSource = SourceGetter.getSource();
        String aTag = "(<a href=\"http://|<a href=\"https://){1}[\\w\\.\\-/:\\#\\?\\=\\&\\;\\%\\~\\+]+";
        
        Pattern pattern = Pattern.compile(aTag);  
        Matcher matcher = pattern.matcher(httpSource);
        
        ArrayList<String> linkList = new ArrayList<String>();
        while (matcher.find()) {
            linkList.add(matcher.group(0).replace("<a href=\"", ""));            
        }  
        
        return linkList;
        
        
    }

}

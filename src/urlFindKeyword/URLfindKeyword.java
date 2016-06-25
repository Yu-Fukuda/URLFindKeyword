package urlFindKeyword;

import java.io.IOException;

public class URLfindKeyword {
    public static void main(String[] kanazawaShintenOmedetougozaimasu) throws IOException {
        
        SetURLKeyword.url = SetURLKeyword.setURL();
        SetURLKeyword.keyword = SetURLKeyword.setKeyword();
         
                
        System.out.println(SetURLKeyword.keyword + "を探すためにたどった経路"); // 1回のみ
        
        System.out.println(SetURLKeyword.url + "\n    ↓"); // キーワード検索がヒットするまで繰り返す
        
        if (KeywordFinder.keywordFound() ){
            System.out.println("キーワード発見");
        } else if (KeywordFinder.keywordFound() == false) {
            System.out.println("キーワード見つからない");
            
        } else {
            System.out.println("キーワード判定エラーです");
        }
        
        //String httpSource = SourceGetter.getSource() ;
        //System.out.println("ソースの中身: " + httpSource);
    }

}

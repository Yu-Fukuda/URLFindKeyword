package urlFindKeyword;

import java.io.IOException;

public class URLfindKeyword {
    public static void main(String[] kanazawaShintenOmedetougozaimasu) throws IOException {
        
        SetURLKeyword.url = SetURLKeyword.setURL();
        SetURLKeyword.keyword = SetURLKeyword.setKeyword();
         
                
        System.out.println(SetURLKeyword.keyword + " を探すためにたどった経路"); // 1回のみ
        System.out.println(SetURLKeyword.url + "\n    ↓"); 
        
        int i = 0;
        while (ATagKeywordFinder.keywordFound() == false){
            //キーワードが見つからなかったら、URLを更新する 
            SetURLKeyword.url = ATagKeywordFinder.aTagFilter().get(i);
            System.out.println(ATagKeywordFinder.aTagFilter().get(i));
            System.out.println("    ↓"); 
            i ++ ;
            
            if (i >= ATagKeywordFinder.aTagFilter().get(i).length()){
                System.out.println(SetURLKeyword.keyword + "は見つかりませんでした。");
            }
        }
        System.out.println("キーワード発見!!");
        
        //String httpSource = SourceGetter.getSource() ;
        //System.out.println("ソースの中身: " + httpSource);
    }

}

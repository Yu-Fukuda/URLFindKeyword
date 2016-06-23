package urlFindKeyword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

class SourceGetter {
    static String getSource() throws IOException{
        String inputtedURL = SetURLKeyword.setURL() ;
        
        URL url = new URL(inputtedURL);
        
        InputStream inputStream = url.openStream();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            BufferedReader bufferedReader 
            = new BufferedReader(new InputStreamReader(inputStream));
            String source1line = "";
            //ソースを1行ずつ読む  最後の行の次はnullになるからnullになるまで読む
            while (((source1line = bufferedReader.readLine())== null) == false) { 
                stringBuffer.append(source1line);
            }
        } catch (Exception e) {
        }
        
        //System.out.println(stringBuffer);
        
        inputStream.close();
        return stringBuffer.toString();
    }

}

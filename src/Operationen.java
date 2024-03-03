public class Operationen {
    String repCodeEncode(String s, int n){
        String encoded = "";
        int p = 0;
        for(int l = 0; l < s.length(); l++){
            for(int i = 0; i < n; i++){
                encoded += s.charAt(p);
            }
            p ++;
        }
        return encoded;
    }
    String repCodeDecode(String s, int n){
        String decoded = "";
        int p = 0;
        for(int l = 0; l < s.length()/n; l++){
            decoded += s.charAt(p);
            for(int i = 0; i < n; i++){
                p ++;
            }
        }
        return decoded;
    }
}

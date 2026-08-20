class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        
        while(i<word.length() && j<abbr.length()){
            char a= word.charAt(i);
            char b = abbr.charAt(j);
            
            int current = 0;
            if(!Character.isDigit(b)){
                if(b == a){
                    i++;
                    j++;
                }
                else
                    return false;
            }
            else{
                if(b == '0'){
                    return false;
                }
                while(j< abbr.length() && Character.isDigit(abbr.charAt(j))){
                    current = current*10 + (abbr.charAt(j)-'0');
                    j++;
                }
                i+= current;
            }
        }
        return i== word.length() && j == abbr.length();
    }
}
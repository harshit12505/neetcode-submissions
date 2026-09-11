class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        // i m p l e m e n t a t i o n
        //                           i
        // i 1 2 n
        //       j

        int i = 0; 
        int j = 0;

        while(i<word.length() && j< abbr.length()){
            char a= word.charAt(i);
            char b = abbr.charAt(j);

            if(Character.isLetter(b)){
                if(a == b){
                    i++;
                    j++;
                }
                else
                    return false;
            }
            else{
                if(b == '0')
                    return false;
                int current = 0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    current = current*10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += current;
                
            }

        }
        return i == word.length() && j == abbr.length();
    }
}
class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        
        while(j<abbr.length() && i<word.length()){
            char a = word.charAt(i);
            char b = abbr.charAt(j);
            int current = 0;
            if(!Character.isDigit(b)){
                if(a == b){
                    i++;
                    j++;
                }
                else{
                    return false;
                }
            }
            else{
                if(abbr.charAt(j) == '0')
                    return false;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j)))
                {
                    current = current*10 + (abbr.charAt(j) - '0');
                    j++;

                }
                i += current;
            }

        }
        return i== word.length() && j== abbr.length();
    }
}
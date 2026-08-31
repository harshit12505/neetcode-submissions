class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        while(i<s.length()){
            char a = s.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
            i++;
            
        }
        int j = 0;
        while(j< t.length()){
            char a = t.charAt(j);
            if(map.containsKey(a))
                map.put(a, map.get(a) -1);
            else 
                return false;
            j++;
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Check if the current value is not 0
            if (entry.getValue() != 0 && entry.getValue() != Integer.valueOf(0)) {
                return false;
            }
        }
        return true;
        
    }
}

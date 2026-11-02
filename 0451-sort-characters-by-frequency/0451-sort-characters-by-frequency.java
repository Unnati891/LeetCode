class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        List<Character>s1=new ArrayList<>(freq.keySet());
        s1.sort((a,b)->freq.get(b)-freq.get(a));
        StringBuilder result = new StringBuilder();
         for (char c : s1) {
            int count = freq.get(c);

            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
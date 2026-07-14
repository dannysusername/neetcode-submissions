class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        // String s = "6#ta#ble3#cat";
        int length = str.length();
        int p1 = 0;
        List<String> result = new ArrayList<>();

        while(p1 < length) {
            
            int hash = str.indexOf('#', p1); //save the hashes index
            int wordLength = Integer.parseInt(str.substring(p1, hash)); //save the words length into int

            String word = str.substring(hash + 1, hash + 1 + wordLength);
            result.add(word);

            p1 = hash + 1 + wordLength;

        }

        return result;
    }
}

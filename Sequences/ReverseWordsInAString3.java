class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return stringBuilder.toString().trim();
    }
}
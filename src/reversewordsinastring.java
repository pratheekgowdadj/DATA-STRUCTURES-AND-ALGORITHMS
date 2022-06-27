public class reversewordsinastring {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] c = s.toCharArray();
        int start = 0 , end;
        for(end=0;end<c.length;end++){
            if(c[end] == ' '){
                reverse(c, start, end-1);
                start = end + 1;
            }
        }
        reverse(c, start , end - 1);
        return new String(c);
    }

    private static void reverse(char[] c, int start , int end){
        while(start < end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;end--;
        }
    }
}

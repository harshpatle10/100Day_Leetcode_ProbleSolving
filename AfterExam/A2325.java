package leetcodeQ.AfterExam;
/*
 key = "the quick brown fox jumps over the lazy dog",
  message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 */
public class A2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String str ="";
        System.out.println("thequickbrownfoxjumpsoverthelazydog");
        String letter = "abcdefghijklmnopqrstuvwxyz";
        String nstr = "";
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)>=97 && key.charAt(i)<=122) {
                str = str + key.charAt(i);
            }
        }
        System.out.println();
        for(int i=0;i<message.length();i++)
        {
            char rem = message.charAt(i);
            if(rem>=97&&rem<=122) {
                int p = letter.indexOf(rem) ;
                nstr = nstr + str.charAt(p);
            } else{
                nstr = nstr+" ";
            }
        }
        System.out.println(nstr);

    }
}

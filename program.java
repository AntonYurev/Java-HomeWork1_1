package java_projects;

public class program {
    String word1 = "dfhgghh";
    String word2 = "dgfgg";
    int a = word1.length();
    int b = word2.length();
    int i = 0;
    String merged = "";
    while (a>0 && b>0);
        {
        merged = merged + word1.charAt(i);
        merged = merged + word2.charAt(i);
        a = a-1;
        b = b-1;
        i = i + 1;
        }
    if (a>0) merged = merged + word1.substring(i);
    if (b>0) merged = merged + word2.substring(i);
    System.out.println ( merged );
    }
}
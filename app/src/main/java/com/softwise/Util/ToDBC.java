package com.softwise.Util;

/**textView所有字符改成全角，避免排版混乱
 * Created by softwise on 2016/12/20.
 */

public class ToDBC {
    public  String toDBC(String input) {
        char[] c = input.toCharArray();
        for (int i = 0; i< c.length; i++) {
            if (c[i] == 12288) {
                c[i] = (char) 32;
                continue;
            }if (c[i]> 65280&& c[i]< 65375)
                c[i] = (char) (c[i] - 65248);
        }
        return new String(c);
    }
}

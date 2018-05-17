package com.tasks6.rle;

public class Application {
  public static void main(String[] args) {

        String data = "";

        if (args != null && args.length > 0) {
            data = args[0];
        }

        System.out.println(encode(data));
    }

    public static String encode(String strText) {

        String result = "";

        if (strText != null && !strText.isEmpty()) {
            StringBuffer buffer = new StringBuffer();
            int runLength;
            for (int i = 0; i < strText.length(); i++) {
                runLength = 1;
                while (i + 1 < strText.length() && strText.charAt(i) == strText.charAt(i + 1)) {
                    runLength++;
                    i++;
                    if (runLength == 9) {
                        break;
                    }
                }

                buffer.append(strText.charAt(i));
                if (runLength >= 2) {
                    buffer.append(runLength);
                }
            }
            result = buffer.toString();
        }
        return result;
    }
}

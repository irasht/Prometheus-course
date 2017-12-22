public class Application {

    public static void main(String[] args) {
        String data = "";
        if (args != null && args.length > 0) {
            data = args[0];
        }
        System.out.println(decode(data));
    }

    public static String decode(String str) {
        String result = "";
        if (str != null && !str.isEmpty() &&
                !"0123456789".contains(str.substring(0, 1))) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                if ((Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) ||
                        str.charAt(i) == str.charAt(i + 1)) {
                    return result;
                }
            }
            char lastCh = 0;
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < chars.length; i++) {
                char somech = chars[i];
                if (!Character.isDigit(somech)) {
                    lastCh = somech;
                    buffer.append(somech);
                } else {

                    int number = Integer.parseInt(String.valueOf(somech));
                    for (int j = 0; j < number - 1; j++) {
                        buffer.append(lastCh);
                    }
                }
                result = buffer.toString();
            }
        }
        return result;
    }
}


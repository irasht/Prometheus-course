package com.tasks5.command; 

public class Application {
    public static void main(String[] args) {

        if (args == null ||
                args.length == 0 ||
                args[0] == null ||
                args[0].equals("")) {
            System.out.println("Error");
        } else {

            if (args.length == 1 &&
                    args[0].equals("help")) {
                new Help().execute();
            } else if (args.length == 1 &&
                    args[0].equals("exit")) {
                new Exit().execute();
            } else if (args.length == 2 && args[1] != null &&
                    args[0].equals("date") &&
                    args[1].equals("now")) {
                new DateNow().execute();
            } else if (args.length == 2 && args[1] != null &&
                    args[0].equals("echo")) {
                new Echo(args[1]).execute();
            } else {
                System.out.println("Error");

            }

        }
    }
}

package com.tasks5.command; 

public class Help implements Command {

      public void execute() {

        System.out.println("Help executed");
    }

}

package com.tasks5.command; 

public class Echo implements Command {
    String text;

    public Echo(String text) {
        this.text = text;
    }

    public void execute() {

             System.out.println(text);
    }
}

package com.tasks5.command; 

public class DateNow implements Command {
    public void execute() {

        System.out.println(System.currentTimeMillis());
    }
}


package com.tasks5.command; 

public class Exit implements Command {

    public void execute() {

        System.out.println("Goodbye!");
    }
}

public class basic {
    public static void main(String[] args) {
        for (String arg : args){
            System.out.println("Yo, " + arg);
        }
        if (args.length == 0) {
            System.out.println("No args, oh well...");
        }

    }

}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> list = new ArrayList<>();

        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            final String menu = "A - Add D - Delete P - Print Q - Quit";
            boolean done = false;
            String cmd = "";

            do
            {
                // display the list
                displayList();
                // displays menu options

                // get menu choice
                cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
                cmd = cmd.toUpperCase();

                // execute choice
                switch(cmd)
                {
                    case "A":
                        // prompt user for list item
                        list.add(console.nextLine());

                        // make sure it's not empty string (si getnonzerolengthstring)
                        // add to list
                        break;
                    case "D":
                        // prompt user for the number of the item to delete
                        // translate the number to an index by subtracting 1
                        // remove item from the list
                        list.remove(console.nextLine());
                        break;
                    case "P":
                        System.out.println(list);
                        break;
                    case "Q":
                        System.exit(0);
                        break;
                }
                System.out.println("cmd is " + cmd);



            }
            while(!done);
        }

    private static void displayList() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        if(list.size() != 0) {

            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%35s", i + 1, list.get(i));
                System.out.println("");
            }
        }
        else
            System.out.println("List is empty");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
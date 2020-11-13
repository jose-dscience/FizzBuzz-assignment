package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args)
    {
        String output;

        int starting = 1;
        int ending = 101;
        boolean e_arg = false;
        boolean l_arg = false;
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-e" -> {
                    if(!l_arg)
                    {
                        ending = 106;
                    }
                    e_arg = true;
                }
                case "-f" -> {
                    i++;
                    starting = Integer.parseInt(args[i]);
                }
                case "-l" -> {
                    l_arg = true;
                    i++;
                    ending = Integer.parseInt(args[i]);
                }
                default -> {
                    System.out.println("Sorry, \"" + args[i] + "\" is not an argument. This is the list of arguments:");
                    System.out.println("  -e: Run the extended version of the algorithm.");
                    System.out.println("  -f <int>: Set the first number of the sequence.");
                    System.out.println("  -l <int>: Set the last number of the sequence.");
                    return;
                }
            }
        }

        if(!e_arg)
        {
            simple_FizzBuzz local_iterator = new simple_FizzBuzz(starting, ending);
            do {
                System.out.println(local_iterator.get());
            } while (local_iterator.next());
        } else {
            extended_FizzBuzz local_iterator = new extended_FizzBuzz(starting, ending);
            do {
                System.out.println(local_iterator.get());
            } while (local_iterator.next());
        }
    }

}
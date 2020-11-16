package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args)
    {
        String output;

        int starting = 1;       //default starting number
        int ending = 101;       //defalt ending number
        boolean e_arg = false;  //-e (extended) argument provided?
        boolean l_arg = false;  //-l (last) argument provided?
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

                    //exception for non-int format.
                    try {
                        starting = Integer.parseInt(args[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("Error with -f value. Starting number must be a positive integer.");
                    }
                }
                case "-l" -> {
                    l_arg = true;
                    i++;
                    try {
                        ending = Integer.parseInt(args[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("Error with -l value. Ending number must be a positive integer.");
                    }
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

        //iterator reference
        FizzBuzz_iterator local_iterator;

        //set the correct iterator type
        if(!e_arg)
        {
            local_iterator = new simple_FizzBuzz(starting, ending);
        } else {
            local_iterator = new extended_FizzBuzz(starting, ending);
        }

        //iterate and print
        do{
            System.out.println(local_iterator.get());
        }while(local_iterator.next());
    }

}
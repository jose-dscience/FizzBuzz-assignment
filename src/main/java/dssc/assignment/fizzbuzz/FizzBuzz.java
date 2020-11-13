package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args)
    {
        String output;

        if(args.length == 0) {
            simple_FizzBuzz local_iterator = new simple_FizzBuzz(1, 101);
            do {
                System.out.println(local_iterator.get());
            } while (local_iterator.next());
        }
        else if(args.length == 1 && args[0].equals("-e"))
        {
            extended_FizzBuzz local_iterator = new extended_FizzBuzz(1,106);
            do {
                System.out.println(local_iterator.get());
            }while(local_iterator.next());
        }
        else if(args.length == 1)
        {
            System.out.println("Argument \"" + args[0] + "\" not recognised. Please, take a look to the list of arguments:");
            System.out.println("   -e  Run the algorithm in its extended version");
        }
        else
        {
            System.out.println("Sorry, only one argument can be provided");
        }

    }
}
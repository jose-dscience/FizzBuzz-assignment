package dssc.assignment.fizzbuzz;

/*
This abstract class implements a sort of iterator that makes 1-teps in an integer number and maks it by itself into its String form or by other
Strings under certain conditions. The class is completely implemented except for actions performed to substitute the default number
Stream by other Streams. It can be implemented in the "actions" method by extending this class.
 */
public abstract class FizzBuzz_iterator {
    private int x;
    private String mask;
    final private int ending;
    final private int beginning;

    //private module. Adds a layer of security on the construction of the instances.
    private void security()
    {
        if(beginning < 0)
        {
            throw new IllegalArgumentException("Error: The initial value cannot be negative.");
        } else if (ending < 0) {
            throw new IllegalArgumentException("Error: The final value cannot be negative.");
        } else if (ending < beginning) {
            throw new IllegalArgumentException("Error: the initial value cannot be greater than the final value.");
        }
    }

    //main constructor: receives the starting point and the ending point.
    //  +INPUTS:    -int beginning, lower extreme of the range in which the operator works
    //              -int ending, upper extreme of the range in which the operator works (is not included).
    FizzBuzz_iterator(int beginning, int ending)
    {
        x = beginning;
        this.ending = ending;
        this.beginning = beginning;
        mask = "";

        security();
    }

    //uncomplete constructor: receives only the ending point and assume the starting point as 1.
    //  +INPUTS:    -int ending, upper extreme of the range in which the operator works (is not included).
    FizzBuzz_iterator(int ending)
    {
        this(0, ending);
    }

    //modifies "mask" variable imposing the "FizzBuzz" behavior.
    void Condition()
    {
        if(x%3==0){
            mask += "Fizz";
        }
        if(x%5==0) {
            mask += "Buzz";
        }
    }

    //modifies "mask" variable adding the "Bang" behavior. Should be used after Condition() method.
    void Condition_extended()
    {
        Condition();
        if(x%7 == 0)
        {
            mask += "Bang";
        }
    }

    //updates the current value of "mask" variable with the "x" value on its Stream representation.
    void enmask()
    {
        if(mask.equals(""))
        {
            mask = String.valueOf(x);
        }
    }

    //returns the current value of the "mask" variable.
    //  +OUTPUT: String, value of "mask".
    String get()
    {
        return mask;
    }

    //perform some actions on each iteration. Must be implemented by the user. Should use "Condition" and "Condition_extended()" methods.
    abstract void actions();

    //resets the iterator, turning it into it first-iteration state.
    void reset()
    {
        x = beginning;
        mask = "";
    }

    //makes the iterator perform one step. When the upper limit of the operation range is reached, the iterator is resetted.
    //  +OUTPUT: boolea, return false when the last step is reached and the iterator resetted and true otherwise.
    boolean next()
    {
        mask = "";
        actions();
        enmask();

        //if index reach the ending, the iterator is restarted and it return false
        if(x == ending){
            this.reset();
            return false;
        }

        x++;

        return true;
    }

}

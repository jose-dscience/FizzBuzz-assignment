package dssc.assignment.fizzbuzz;

public abstract class FizzBuzz_iterator {
    private int x;
    private String mask;
    final private int ending;
    final private int beginning;

    FizzBuzz_iterator(int beginning, int ending)
    {
        x = beginning;
        this.ending = ending;
        this.beginning = beginning;
        mask = "";
    }

    FizzBuzz_iterator(int ending)
    {
        this(0, ending);
    }

    void Condition()
    {
        if(x%3==0){
            mask += "Fizz";
        }
        if(x%5==0) {
            mask += "Buzz";
        }
    }

    void Condition_extended()
    {
        Condition();
        if(x%7 == 0)
        {
            mask += "Bang";
        }
    }

    void enmask()
    {
        if(mask.equals(""))
        {
            mask = String.valueOf(x);
        }
    }

    String get()
    {
        return mask;
    }

    //perform some actions on each iteration. Must be implemented by the user
    abstract void actions();

    void reset()
    {
        x = beginning;
        mask = "";
    }

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

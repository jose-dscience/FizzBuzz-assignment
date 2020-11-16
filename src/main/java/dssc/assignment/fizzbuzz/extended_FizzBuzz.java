package dssc.assignment.fizzbuzz;

//This class extends FizzBuzz_iterator class by adding the "FizzBuzz" behavior scheme.
public class extended_FizzBuzz extends FizzBuzz_iterator {
    extended_FizzBuzz(int beginning, int ending) {
        super(beginning, ending);
    }

    extended_FizzBuzz(int ending) {
        super(0, ending);
    }

    @Override
    void actions() {
        Condition_extended();
    }
}

package dssc.assignment.fizzbuzz;

//This class extends FizzBuzz_iterator class by adding the "FizzBuzzBang" behavior scheme.
public class simple_FizzBuzz extends FizzBuzz_iterator {
    simple_FizzBuzz(int beginning, int ending) {
        super(beginning, ending);
    }

    simple_FizzBuzz(int ending) {
        super(0, ending);
    }

    @Override
    void actions() {
        Condition();
    }
}

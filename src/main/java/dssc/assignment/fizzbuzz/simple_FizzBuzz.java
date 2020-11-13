package dssc.assignment.fizzbuzz;

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

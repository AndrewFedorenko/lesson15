package random;

import java.util.Random;

public interface Generator <T extends Number> {
    T getNextRand();
}

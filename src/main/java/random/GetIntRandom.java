package random;

import java.util.Random;

public class GetIntRandom extends AbstractRandom implements random.Generator<Integer> {

    @Override
    public Integer getNextRand() {
        return super.rnd.nextInt();
    }
}

package random;

import java.util.Random;

public class GetFloatRandom extends AbstractRandom implements random.Generator<Float>{
    @Override
    public Float getNextRand() {
        return super.rnd.nextFloat();
    }
}

package random;

import java.util.Random;

public class GetDoubleRandom extends AbstractRandom implements Generator<Double>{
    @Override
    public Double getNextRand() {
        return super.rnd.nextDouble();
    }
}
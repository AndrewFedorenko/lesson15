package random;

import java.util.Random;

public class GetFloatRandom implements random.Generator{
    @Override
    public Float getNextRand() {
        Random intRnd = new Random();
        return intRnd.nextFloat();
    }
}
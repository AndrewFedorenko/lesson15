package random;

import java.util.Random;

public class GetDoubleRandom implements Generator{
    @Override
    public Double getNextRand() {
        Random intRnd = new Random();
        return intRnd.nextDouble();
    }
}
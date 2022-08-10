package random;

import java.util.Random;

public class GetIntRandom implements random.Generator {

    @Override
    public Integer getNextRand() {
        Random intRnd = new Random();
        return intRnd.nextInt();
    }
}

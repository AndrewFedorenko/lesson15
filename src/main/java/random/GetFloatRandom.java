package random;

public class GetFloatRandom extends AbstractRandom implements random.Generator<Float>{
    @Override
    public Float getNextRand() {
        return super.rnd.nextFloat();
    }
}

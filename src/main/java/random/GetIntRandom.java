package random;

public class GetIntRandom extends AbstractRandom implements random.Generator<Integer> {

    @Override
    public Integer getNextRand() {
        return super.rnd.nextInt();
    }
}

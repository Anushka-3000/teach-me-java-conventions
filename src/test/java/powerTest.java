import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import powerpackage.powerFinder;

public class powerTest {
    @Test
    public void OneRaisedToOneIsOne() {
        powerFinder pf = new powerFinder();
        assert powerFinder.OF(1,1) == 1;
    }

    @Test
    public void TwoRaisedToOneIsTwo() {
        powerFinder pf = new powerFinder();
        assert powerFinder.OF(2,1) == 2;
    }

    @Test
    public void TwoPowerOfTwoIsFour() {
        powerFinder pf = new powerFinder();
        assert powerFinder.OF(2, 2) == 4;
    }

    @Test
    public void PowerOfTwoAndThreeIsSix() {
        powerFinder pf = new powerFinder();
        assert powerFinder.OF(3, 2) == 3*3;
    }
}

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambTest {

    public static void main(String[] args) {
        List<List<BigDecimal>> outFlowDate= new ArrayList(0);

        BigDecimal one = BigDecimal.ZERO;
        try {
            one = outFlowDate.stream().filter(item -> item.size() == 0).findFirst().get().stream().filter(it -> it.compareTo(BigDecimal.ONE) == 0).findFirst().get();
        }catch(Exception e){
            one= BigDecimal.ZERO;
        }

        System.out.println(one);
    }
}

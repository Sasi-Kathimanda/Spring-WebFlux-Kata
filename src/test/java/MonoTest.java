import org.junit.Test;
import reactor.core.publisher.Mono;

public class MonoTest {

    @Test
    public void firstMono(){
        Mono.just("A")
                .log()
                .subscribe();
    }
}

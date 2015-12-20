import com.aggredi.decorator.BlackColorButtonDecorator;
import com.aggredi.decorator.RedColorButtonDecorator;
import com.aggredi.decorator.main.component.ButtonImpl;
import org.junit.Test;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class ButtonDecoratorTest {

    @Test
    public void testDecorator() {
        BlackColorButtonDecorator blackColorButtonDecorator = new BlackColorButtonDecorator(new RedColorButtonDecorator(new ButtonImpl()));
        blackColorButtonDecorator.onMouseMoveThrough();
    }
}

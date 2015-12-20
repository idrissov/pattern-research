import com.aggredi.facade.H2ManageDBConnectionFacade;
import com.aggredi.facade.ManageDBConnectionFacadeIF;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class TestFacade {

    @Test
    public void testFacade() {
        ManageDBConnectionFacadeIF manageDBConnectionFacade = new H2ManageDBConnectionFacade();
        Connection sa = manageDBConnectionFacade.createConnection("jdbc:h2:~/test", "sa", "");
        Assert.assertNotNull(sa);
        manageDBConnectionFacade.closeConnection(sa);
    }
}

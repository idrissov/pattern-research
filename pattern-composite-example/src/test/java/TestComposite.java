import com.aggredi.composite.Organization;
import com.aggredi.composite.OrganizationImpl;
import com.aggredi.composite.subordinates.Head;
import com.aggredi.composite.subordinates.Lawyer;
import com.aggredi.composite.subordinates.Manager;
import org.junit.Test;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class TestComposite {

    @Test
    public void testComposite() {
        Organization organization = new OrganizationImpl("EpamInc");
        organization.setHead(new Head("Dracula"));
        Manager manager = new Manager("Darth Vader");
        manager.addSubordinate(new Lawyer("R2D2"));
        manager.addSubordinate(new Head("Chubaka"));
        organization.getHead().addSubordinate(manager);
        organization.getHead().addSubordinate(new Lawyer("Batman"));
        System.out.println(organization);

    }
}

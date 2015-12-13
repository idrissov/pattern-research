import com.aggredi.pattern.proxy.example.Person;
import com.aggredi.pattern.proxy.example.PersonService;
import com.aggredi.pattern.proxy.example.impl.PersonServiceImpl;
import com.aggredi.pattern.proxy.example.impl.PersonServiceImplProxy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Serik Idrissov
 * 12/13/15
 */
public class TestProxy {

    @Test
    public void testProxy() {
        PersonService personService = new PersonServiceImplProxy(new PersonServiceImpl());
        String personToGet = "person2";
        Person person2 = personService.readPerson(personToGet);
        Assert.assertNotNull(person2);
        Assert.assertEquals(personToGet, person2.getName());
    }
}

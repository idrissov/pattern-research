import com.aggredi.pattern.abstrac.factory.example.abstractfactory.PersonServiceCreator;
import com.aggredi.pattern.abstrac.factory.example.abstractfactory.PersonServiceImplementationFactory;
import com.aggredi.pattern.abstrac.factory.example.entity.Person;
import com.aggredi.pattern.abstrac.factory.example.serializer.PersonSerializer;
import com.aggredi.pattern.abstrac.factory.example.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Serik Idrissov
 * 12/16/15
 */
@RunWith(value = Parameterized.class)
public class AbstractFactoryTest {

    private PersonServiceImplementationFactory.ServiceType serviceType;

    private String resourceName;

    public AbstractFactoryTest(PersonServiceImplementationFactory.ServiceType serviceType, String resourceName) {
        this.serviceType = serviceType;
        this.resourceName = resourceName;
    }

    @Parameterized.Parameters(name = "{index}: {0} {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {PersonServiceImplementationFactory.ServiceType.FILE, "test.txt"},
                {PersonServiceImplementationFactory.ServiceType.DB, "jdbc:h2:~/test"}

        });

    }

    @Test
    public void testAbstractFactory() throws IOException, SQLException, ClassNotFoundException {

        PersonServiceCreator serviceCreator
                = PersonServiceImplementationFactory.createServiceCreator(serviceType);

        PersonSerializer serializer = serviceCreator.createSerializer();
        PersonService service = serviceCreator.createService(serializer, resourceName);

        service.writePerson(new Person("Serik", 18));
        Person serik = service.readPerson("Serik");

        Assert.assertNotNull(serik);

    }
}

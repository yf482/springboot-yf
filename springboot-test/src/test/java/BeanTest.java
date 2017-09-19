import com.yf.test.TestBean;
import com.yf.test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-19 22:35
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class BeanTest {

    @Autowired
    private TestBean testBean;

    @Test
    public void devBeanInject(){
        String expected = "dev";
        Assert.assertEquals(expected,testBean.getContent());
    }
}


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
//        BeanFactory factory = getBeanFactory();
//        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
//        mr.render();
    }
}

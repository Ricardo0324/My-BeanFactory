import entity.Bean;
import entity.Student;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyBeanFactoryApplication
 * @Description: //TODO 启动类
 * @Author wyq
 * @Date 2022/9/3 20:26
 */
public class MyBeanFactoryApplication {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        System.out.println(student1);

        //声明Bean对象，类似xml功能
        Bean bean=new Bean();
        bean.setBeanId("student");
        bean.setClassPath("entity.Student");
        List<Bean> beanList=new ArrayList<Bean>();
        beanList.add(bean);

        //向工厂传入配置文件，类似于ApplicationContext
        BeanFactory factory=new BeanFactory();
        factory.setBeanList(beanList);

        //查看工厂创建好的实例对象
        Student student=(Student) factory.getBean("student");
        System.out.println(student);


        /*//通过 ClassPathXmlApplicationContext来读取配置文件xml
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring_config.xml");
        //然后就可以看到工厂创建好的实例对象
        Student student = (Student) factory.getBean("student");
        System.out.println(student);*/
    }
}

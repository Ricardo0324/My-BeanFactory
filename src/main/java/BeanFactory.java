import entity.Bean;

import java.util.List;

/**
 * @ClassName BeanFactory
 * @Description: //TODO 自定义Bean工厂
 * @Author wyq
 * @Date 2022/9/3 22:04
 */
public class BeanFactory {
    //使用List存放Bean集合
    private List<Bean> beanList;

    public List<Bean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Bean> beanList) {
        this.beanList = beanList;
    }

    /**
     * @Description: //TODO 获取Bean实例
     * @Author: wyq
     * @Date 2022/9/3 22:06
     */
    public Object getBean(String beanId) throws Exception {
        Object instance;
        for (Bean bean : beanList) {
            if (beanId.equals(bean.getBeanId())) {
                String classPath = bean.getClassPath();
                //要求JVM查找并加载指定路径的类
                Class classFile = Class.forName(classPath);
                //调用 newInstance() 默认的构造方法进行实例化,返回一个实例化好的对象
                instance = classFile.newInstance();
                return instance;
            }
        }
        return null;
    }
}

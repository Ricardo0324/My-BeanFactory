package entity;

/**
 * @ClassName Bean
 * @Description: //TODO 自定义Bean实体，对应 Spring 文件中的 <bean> 标签
 * @Author wyq
 * @Date 2022/9/3 21:59
 */
public class Bean {
    private String beanId;

    //注入的文件路径
    private String classPath;

    public String getBeanId() {
        return beanId;
    }

    public void setBeanId(String beanId) {
        this.beanId = beanId;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "beanId='" + beanId + '\'' +
                ", classPath='" + classPath + '\'' +
                '}';
    }
}

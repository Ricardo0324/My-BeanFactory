package entity;

/**
 * @ClassName Teacher
 * @Description: //TODO 教师实体类
 * @Author wyq
 * @Date 2022/9/3 19:31
 */
public class Teacher {
    private String tName;

    public String gettName() {
        return tName;
    }

    //必须提供 setter() 方法，因为 Spring 是根据反射机制通过实体类的 setter() 为对象赋值的
    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class ITWorker {
    private String name;
    final Integer defaultAge = 15;
    private Integer age;
    private String technologyDirection;
    private Integer workExperience;
    private String title;
    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public ITWorker(String name, Integer age, String technologyDirection, Integer workExperience, String title, String company) {
        this.name = name;
        setAge(age);
        this.technologyDirection = technologyDirection;
        this.workExperience = workExperience;
        this.title = title;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < defaultAge) {
            System.out.println("年龄信息无效！已修改默认年龄为15");
            this.age = defaultAge;
        }else {
            this.age = age;
        }
    }

    public String getTechnologyDirection() {
        return technologyDirection;
    }

    public void setTechnologyDirection(String technologyDirection) {
        this.technologyDirection = technologyDirection;
    }
    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void display() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("技术方向：" + this.technologyDirection);
        System.out.println("工作年限：" + this.workExperience);
        System.out.println("目前就职于：" + this.company);
        System.out.println("职务是：" + this.title);
    }

    public static void main(String[] args) {
        ITWorker itWorker = new ITWorker("马末龙", 35, "数据库维护", 10, "数据库维护工程师", "腾讯实业");
        itWorker.display();

        System.out.println("===============================");

        ITWorker itWorker1 = new ITWorker("张凯", 10, "Java开发", 1, "Java开发工程师", "鼎盛科技");
        itWorker1.display();

    }
}

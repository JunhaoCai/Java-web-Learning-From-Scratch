package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class Dog {
    private String breed;
    private Double age;
    private String mood = "心情好";
    private String name;

    public Dog(String breed, Double age, String mood, String name) {
        this.breed = breed;
        this.age = age;
        setMood(mood);
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    protected String run(){
        if (this.mood.equals("心情很好")){
            return  "名字叫" + this.name + "的" + this.breed + this.mood + "，" + "开心的围着主人身边转";
        }else {
            return  "名字叫" + this.name + "的" + this.breed + this.mood + "，" + "伤心的一动不动";
        }
    }

    protected String bark(){
        if (this.mood.equals("心情很好")){
            return  "名字叫" + this.name + "的" + this.breed + this.mood + "，" + "开心的汪汪叫";
        }else {
            return  "名字叫" + this.name + "的" + this.breed + this.mood + "，" + "伤心的呜呜叫";
        }
    }


    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        if (mood.equals("心情很好") || mood.equals("心情不好")){
            this.mood = mood;
        }else {
            System.out.println("输入信息错误，这只狗狗今天心情很好！");
            this.mood = "心情很好";
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("贵宾犬", 1.0, "aba", "甜心");

        Dog dog1 = new Dog("贵宾犬", 1.0, "心情很好", "甜心");
        System.out.println(dog1.run());
        System.out.println(dog1.bark());

        System.out.println("==================================");

        Dog dog2 = new Dog("德国牧羊犬", 2.0, "心情不好", "太子");
        System.out.println(dog2.run());
        System.out.println(dog2.bark());
    }
}

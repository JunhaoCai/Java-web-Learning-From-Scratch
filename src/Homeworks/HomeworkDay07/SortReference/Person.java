package Homeworks.HomeworkDay07.SortReference;

import java.util.Objects;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Person implements Comparable<Person>{
    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public void sort(Object[] obj) {
        Person[] persons=(Person[])obj;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                Person[] temp = new Person[1];
                if (persons[j].age > persons[j + 1].age) {
                    temp[0] = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp[0];
                }
            }
        }
    }


    @Override
    public int compareTo(Person p) {
        if(Objects.equals(this.age, p.age)){
            return 0;
        }else if (this.age > p.age) {
            return 1;
        }else {
            return -1;
        }
    }
}

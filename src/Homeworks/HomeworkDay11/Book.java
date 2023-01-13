package Homeworks.HomeworkDay11;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class Book implements Comparable<Book>{
    private Integer id;
    private String name;
    private double price;
    private String publishing;

    public Book(Integer id, String name, double price, String publishing) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishing = publishing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishing='" + publishing + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.id-o.id;
    }
}

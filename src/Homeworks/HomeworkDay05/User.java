package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class User {
    private String userId;
    private String userPassword;
    private String userEmail;

    public User(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userEmail = userId.concat("@gameschool.com");
    }

    public User(String userId, String userPassword, String userEmail) {
        this(userId, userPassword);
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new User("junhaocai", "123");
        System.out.println(user.toString());

        User user1 = new User("cjh","111","123@gmail.com");
        System.out.println(user1.toString());
    }
}

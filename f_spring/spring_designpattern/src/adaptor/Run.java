package adaptor;

public class Run {
    
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.login("GOOGLE", "123asd");
    }
    
}

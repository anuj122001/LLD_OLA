package src;

public class User {
    protected String userId;
    protected String userName;
    public User(String userId,String userName)
    {
         this.userId = userId;
         this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}

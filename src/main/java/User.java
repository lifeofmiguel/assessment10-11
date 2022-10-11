public class User implements IPrint {
    private String username;
    private String password;
    public String User;

    public User(String username, String password, String user) {
        this.username = username;
        this.password = password;
        User = user;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", User='" + User + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}

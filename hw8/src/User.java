public class User {
    private int id;
    private String login;
    private String name;
    private String password;

    public User(int id,String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;


    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "login: "+this.login+"name: "+this.name+"password: "+this.password+"id: "+this.id;
    }
}

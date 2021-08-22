package entiti;

public class User {
    private int id;
    private String userName;
    private String role_id;

    public User( String userName, String role_id) {
        this.userName = userName;
        this.role_id = role_id;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
}

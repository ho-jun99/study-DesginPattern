package abstractFactory.domain.userInfo;

public class UserInfo {
    private String username;
    private String userId;
    private String userpw;

    public UserInfo(String username, String userId, String userpw) {
        this.username = username;
        this.userId = userId;
        this.userpw = userpw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }
}

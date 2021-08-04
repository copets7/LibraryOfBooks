package entiti;

public class LogRecord {
    private int id;
    private String libCode;
    private int user_id;
    private int status_id;
    private String createDate;
    private String closeDate;
    private String createBy;

    public LogRecord(int id, String libCode, int user_id, int status_id, String createDate, String closeDate, String createBy) {
        this.id = id;
        this.libCode = libCode;
        this.user_id = user_id;
        this.status_id = status_id;
        this.createDate = createDate;
        this.closeDate = closeDate;
        this.createBy = createBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibCode() {
        return libCode;
    }

    public void setLibCode(String libCode) {
        this.libCode = libCode;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}

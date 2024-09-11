package gr.aueb.cf.schoolapp.dto;


public abstract class BaseUserDTO {
    private String username;
    private String password;
    private String confirmPassword;

    public BaseUserDTO() {}

    public BaseUserDTO(String username, String password, String confirmedPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmedPassword;
    }

    public BaseUserDTO(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
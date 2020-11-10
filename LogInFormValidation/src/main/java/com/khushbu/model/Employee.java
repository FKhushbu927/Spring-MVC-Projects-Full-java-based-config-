package com.khushbu.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
    @Size(min=1,message="required")
    public String userName;
    @Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8")
    public String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

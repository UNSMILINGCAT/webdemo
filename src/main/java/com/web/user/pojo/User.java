package com.web.user.pojo;

public class User
{
    private int userId;
    private String userName;
    private String password;
    private String e_mail;
    private int mobile;

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getE_mail()
    {
        return e_mail;
    }

    public void setE_mail(String e_mail)
    {
        this.e_mail = e_mail;
    }

    public int getMobile()
    {
        return mobile;
    }

    public void setMobile(int mobile)
    {
        this.mobile = mobile;
    }
}

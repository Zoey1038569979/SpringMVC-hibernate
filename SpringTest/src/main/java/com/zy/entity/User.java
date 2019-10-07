package com.zy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="my_users")
public class User {
	private Integer userId;
    private String userPhoneNum;
    private String userName;
    private String passWord;

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }
   
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Column(name = "user_phoneNum")
    public String getUserPhoneNum() {
        return userPhoneNum;
    }
   
    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }


    @Column(name = "username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

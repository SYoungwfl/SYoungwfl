package com.cookandroid.healthapp;


public class MemberInfo {
    private String name;
    private String phoneNumber;
    private String birth;
    private String photoUrl;

    public MemberInfo(String name, String phoneNumber, String birth){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

    public MemberInfo(String name, String phoneNumber, String birth, String photoUrl){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
        this.photoUrl = photoUrl;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getBirth(){
        return this.birth;
    }

    public void setBirth(String birth){
        this.birth = birth;
    }

    public String getPhotoUrl(){
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }
}


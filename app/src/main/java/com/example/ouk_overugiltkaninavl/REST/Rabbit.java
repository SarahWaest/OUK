package com.example.ouk_overugiltkaninavl.REST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.time.LocalDate;


public class Rabbit implements Serializable {
    public Rabbit(){

    }

    public Rabbit(Integer id, String name, boolean sex, LocalDate birthday, String rabbitType, String origin, Integer litterId){
        setId(id);
        setName(name);
        setSex(sex);
        setBirthday(birthday);
        setRabbitType(rabbitType);
        setOrigin(origin);
        setLitterId(litterId);
    }

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sex")
    @Expose
    private boolean sex;
    @SerializedName("birthday")
    @Expose
    private LocalDate birthday;
    @SerializedName("rabbit_type")
    @Expose
    private String rabbitType;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("litter_id")
    @Expose
    private int litterId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRabbitType() {
        return rabbitType;
    }

    public void setRabbitType(String rabbitType) {
        this.rabbitType = rabbitType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getLitterId() {
        return litterId;
    }

    public void setLitterId(Integer litterId) {
        this.litterId = litterId;
    }
}

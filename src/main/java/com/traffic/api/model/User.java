package com.traffic.api.model;

import java.util.UUID;

public class User {
    private long id;
    private String name;
    private String email;
    private String password;
    private String randomId;

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.randomId = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
    }

    public long getId()
    {
       return id;
    }
    public String getName()
    {
       return name;
    }
    public String getEmail()
    {
      return email;
    }
    public String getPassword()
    {
      return password;
    }
    public String getRandomId()
    {
      return randomId;
    }
}

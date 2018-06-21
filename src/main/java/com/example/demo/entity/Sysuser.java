package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zp
 * @since 2018-06-15
 */
public class Sysuser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public Sysuser(Long id ,String name){
        this.id=id;
        this.name=name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sysuser{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}

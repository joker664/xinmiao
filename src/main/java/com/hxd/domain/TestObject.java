package com.hxd.domain;

import java.io.Serializable;

/**
 * Created by Joker on 2015/10/31.
 */
public class TestObject implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

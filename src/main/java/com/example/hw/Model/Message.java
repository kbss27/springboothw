package com.example.hw.Model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by hyunwoo on 2017-09-18.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long idx;

    @Column
    @NotEmpty
    @Length(min = 3, max = 15)
    private String name;

    @Column
    @NotEmpty
    @Length(min = 1, max = 255)
    private String content;

    public Long getIdx() {
        return this.idx;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

//    public boolean isInvalid() {
//        return "김현우".equals(this.name) || "김지수".equals(this.name);
//    }
}

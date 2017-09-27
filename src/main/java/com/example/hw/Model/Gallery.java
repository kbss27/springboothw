package com.example.hw.Model;

import com.example.hw.enums.GalleryType;

import javax.persistence.*;

/**
 * Created by hyunwoo on 2017-09-19.
 */
@Entity
public class Gallery {
    @Id
    @GeneratedValue
    private Long idx;

    @Column
    private String title;

    @Column
    private String subtitle;

    @Column
    private String content;

    @Column
    private String imagesJson;

    @Column
    @Enumerated(EnumType.STRING)
    private GalleryType type;

    @Column
    private String category;

    public Long getIdx() {
        return this.idx;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getContent() {
        return this.content;
    }

    public String getImagesJson() {
        return this.imagesJson;
    }

    public GalleryType getType() {
        return this.type;
    }

    public String getCategory() {
        return this.category;
    }
}

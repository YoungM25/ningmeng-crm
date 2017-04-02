package com.ningmeng.domain.system;

public class SystemPermission {
    private Long id;

    private String url;

    private String desc;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
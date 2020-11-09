package com.chenjm.sportplay.bean;

import java.util.List;

public class MainMenu {
    private Integer id;
    private String title;
    private String path;
    private List<SubMenu> slist;

    public List<SubMenu> getSlist() {
        return slist;
    }

    public void setSlist(List<SubMenu> slist) {
        this.slist = slist;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MainMenu() {
    }

    public MainMenu(Integer id, String title, String path, List<SubMenu> slist) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.slist = slist;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", slist=" + slist +
                '}';
    }
}

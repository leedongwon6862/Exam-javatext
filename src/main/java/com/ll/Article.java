package com.ll;

public class Article {


    private int id ;
    private String title ;
    private String body ;
    private int hit ;
    private int redate ;


    public void increasHit (){this.hit++;}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getRedate() {
        return redate;
    }

    public void setRedate(int redate) {
        this.redate = redate;
    }

    public Article(int id, String title, String body, int hit, int redate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.hit = hit;
        this.redate = redate;






    }}
package com.graph;

/**
 * Created by oshev on 17.06.2016.
 */

public class GraphService {

    private final String text;
//    private final long id;


    public GraphService(String text) {
    //    this.id = id;
        this.text = text;
    }


    public String getText(){
        return this.text;
    }
//    public long getId(){
//        return id;
//    }
}

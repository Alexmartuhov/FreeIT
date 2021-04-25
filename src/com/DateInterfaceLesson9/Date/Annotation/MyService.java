package com.DateInterfaceLesson9.Date.Annotation;

import java.util.Objects;

@Version(numberOfVersion = 7.1)
public class MyService {
    private int id;
    private String name;

    MyService(){
        id=1;
        name="default";
    }
    MyService(int id){
        this.id=id;
        name="default";
    }
    MyService(int id, String name){
        this.id=id;
        this.name=name;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.id, id) == 0 &&
                name.equals(myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private void thisClassInfo(){
        System.out.println("MyService id="+id+"; MyService name="+name);
    }
}

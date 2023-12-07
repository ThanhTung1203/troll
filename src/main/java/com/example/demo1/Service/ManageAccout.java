package com.example.demo1.Service;

import com.example.demo1.Model.Accout;
import com.example.demo1.Model.Page;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManageAccout implements ManageG {


    List<Accout> listAccout = new ArrayList<>();


    public ManageAccout() {
        listAccout.add(new Accout("admin", "admin"));
        listAccout.add(new Accout("user1", "1"));
        listAccout.add(new Accout("user2", "2"));
    }


    public Accout find(String us, String p) {
        for (Accout accout : listAccout) {
            if (accout.getUser().equals(us) && accout.getPassword().equals(p)){
                return accout;
            }
        }
        return null;
    }

    @Override
    public Page findById(int id) {
        return null;
    }

    @Override
    public void findByContent(String content) {

    }

    @Override
    public void findByTitle(String title) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, Page page) {

    }

    @Override
    public void save(Page page) {

    }

    @Override
    public List<Page> showALl() {
        return null;
    }

    public  List<Accout> showListAccout(){
        return listAccout;
    }

    @Override
    public void arrangeByTime(LocalDate localDate) {

    }
}

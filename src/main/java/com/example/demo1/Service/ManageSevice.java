package com.example.demo1.Service;




import com.example.demo1.Model.Page;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManageSevice implements ManageG {


    List<Page> listPage = new ArrayList<>();


    public ManageSevice() {
        listPage.add(new Page(1, "Sẽ gầy", "Kiếm hiệp", 100, "Hành động mannh"));
    }

    @Override
    public Page findById(int id) {
        for (Page p : listPage
        ) {
            if (p.getId() == id) {
                return p;
            }
        }
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
        listPage.remove(findById(id));;
    }



    @Override
    public void update(int id, Page page) {

    }

    @Override
    public void  save(Page page) {
        listPage.add(page);
    }

    @Override
    public List<Page> showALl() {
        return listPage;
    }

    @Override
    public void arrangeByTime(LocalDate localDate) {

    }
}
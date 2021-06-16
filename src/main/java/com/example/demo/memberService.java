package com.example.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class memberService {
    @Autowired
    Repo repo;
    public List<member> getall()
    {
        return repo.findAll();
    }

    public void addone(member member)
    {
        repo.save(member);
    }

    public void delet(int id)
    {
        repo.deleteById(id);
    }

    public  void update (member member)
    {
        if(repo.existsById(member.getKhojiId())) {

            repo.deleteById(member.getKhojiId());
            repo.save(member);
        }
        else
        {
            System.out.println("Not present");
        }
    }

    public String get1(int id)
    {
        return repo.getoen(id).toString();
    }
}

package com.example.hw.service;

import com.example.hw.Model.Message;
import com.example.hw.repository.MsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by daou on 2017-09-18.
 */
@Service
public class MsgService {

    @Autowired
    private MsgRepository msgRepository;

    private List<Message> list;

    @PostConstruct
    public void init() {
        list = msgRepository.findAll();
    }

    public void save(Message msg) {
        list.add(msg);
        msgRepository.save(msg);
    }

    public List<Message> findAll() {
        return this.list;
    }
}

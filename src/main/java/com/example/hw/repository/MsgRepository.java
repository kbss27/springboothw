package com.example.hw.repository;

import com.example.hw.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hyunwoo on 2017-09-18.
 */
public interface MsgRepository extends JpaRepository<Message, Long> {
}

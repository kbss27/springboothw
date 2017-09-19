package com.example.hw.controller;

import com.example.hw.Model.Message;
import com.example.hw.enums.HwResponse;
import com.example.hw.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by daou on 2017-09-18.
 */

@RestController
@RequestMapping(value = "/msg")
public class MsgRestController {

    @Autowired
    private MsgService msgService;

    @GetMapping
    public List<Message> list() {
        return msgService.findAll();
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody @Valid Message message, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            for(ObjectError error : bindingResult.getAllErrors()) {
                return new ResponseEntity<String>(error.getDefaultMessage(), HttpStatus.FORBIDDEN);
            }
            return HwResponse.FAILED.result();
        }
        msgService.save(message);
        return HwResponse.SUCCESS.result();
    }

}

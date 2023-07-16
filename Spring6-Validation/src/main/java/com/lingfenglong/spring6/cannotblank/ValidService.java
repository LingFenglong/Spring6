package com.lingfenglong.spring6.cannotblank;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class ValidService {
    public Message testMessage(@Valid Message msg) {
        return msg;
    }
}

package com.airidge.admin.service.configuration.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public String get_UserInfo (String request){
        log.info("[get_UserInfo service]");
        log.debug("[request : {}]",request);
        return "";
    }



}

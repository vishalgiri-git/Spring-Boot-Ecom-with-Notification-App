package Ecom.Controller;

import Ecom.Model.UserQuery;
import Ecom.Service.UserQueryService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class UserQueryController {
    @Autowired
    private UserQueryService userQueryService;
    Logger logger = LoggerFactory.getLogger(UserQueryController.class);
    @PostMapping
    public String saveQuery(@Valid @RequestBody UserQuery userQuery){
        logger.info(userQuery.getUserName());
        return userQueryService.saveQuery(userQuery);

    }

}

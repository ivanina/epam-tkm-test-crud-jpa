package app.controller;

import app.entity.FbUser;
import app.entity.FbUserSimple;
import app.repository.FbUserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/fb/authentication")
public class FbAuthenticationController {
    @Inject
    FbUserRepository fbUserRepository;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    ArrayList<FbUserSimple> authentication(){
        FbUserSimple user  = new FbUserSimple();
        Iterable<FbUserSimple> l = fbUserRepository.findAll();
        ArrayList<FbUserSimple> l2 = (ArrayList<FbUserSimple>) fbUserRepository.findAll();

        Long count = fbUserRepository.count();

        FbUserSimple u = fbUserRepository.findOne(111222333L);

        return l2;
    }
}

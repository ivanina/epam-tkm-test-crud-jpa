package app.controller;

import app.entity.FbUser;
import app.repository.FbUserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("api/fb/authentication")
public class FbAuthenticationController {
    @Inject
    FbUserRepository fbUserRepository;

    @RequestMapping(method = RequestMethod.GET)
    FbUser authentication(){
        FbUser user  = new FbUser();
        Iterable<FbUser> l = fbUserRepository.findAll();
        List<FbUser> l2 = (List<FbUser>) fbUserRepository.findAll();

        List<FbUser> l3 = (List<FbUser>) fbUserRepository.findByIdIsNot(0L);

        Long count = fbUserRepository.count();

        List<FbUser> l4 = (List<FbUser>) fbUserRepository.findByFirstNameIs("Test");

        FbUser u = fbUserRepository.findOne(10000L);

        return user;
    }
}

package app.repository;

import app.entity.FbUser;
import app.entity.FbUserSimple;
import org.springframework.data.repository.CrudRepository;


public interface FbUserRepository extends CrudRepository<FbUserSimple,Long> {
    Iterable<FbUserSimple> findByIdIsNot(Long id);
    Iterable<FbUserSimple> findByFirstNameIs(String firstName);
}

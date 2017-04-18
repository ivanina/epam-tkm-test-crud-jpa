package app.repository;

import app.entity.FbUser;
import org.springframework.data.repository.CrudRepository;


public interface FbUserRepository extends CrudRepository<FbUser,Long> {
    Iterable<FbUser> findByIdIsNot(Long id);
    Iterable<FbUser> findByFirstNameIs(String firstName);
}

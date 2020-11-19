package site.sousaesilvalucas.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import site.sousaesilvalucas.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}

package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

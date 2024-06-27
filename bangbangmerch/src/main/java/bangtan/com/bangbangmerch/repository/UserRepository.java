package bangtan.com.bangbangmerch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bangtan.com.bangbangmerch.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}

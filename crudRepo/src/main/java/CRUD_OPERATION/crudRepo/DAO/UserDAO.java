package CRUD_OPERATION.crudRepo.DAO;

import CRUD_OPERATION.crudRepo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {

}

package CRUD_OPERATION.crudRepo.Service;


import CRUD_OPERATION.crudRepo.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface UserService {

   public User AddUser(User user);
   public List<User> GetUser();
   public Optional<User> GetUserById(Long Id);

   User UpdateUser(User user);

   User DeleteUser(long l);

//   public boolean DeleteUser(Long Id);

}

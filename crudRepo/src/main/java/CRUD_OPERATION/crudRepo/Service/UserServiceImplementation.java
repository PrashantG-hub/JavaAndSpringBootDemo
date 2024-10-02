package CRUD_OPERATION.crudRepo.Service;

import CRUD_OPERATION.crudRepo.DAO.UserDAO;
import CRUD_OPERATION.crudRepo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
@Autowired
    private UserDAO userDao;

    @Override
    public User AddUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public List<User> GetUser() {
      return  userDao.findAll();
    }

    @Override
    public Optional<User> GetUserById(Long Id){
        return Optional.of(userDao.findById(Id).get());
    }

    @Override
    public User UpdateUser(User user){
        userDao.save(user);
        return user;
    }

    @Override
    public User DeleteUser(long l) {
        User user=userDao.findById(l).get();
        userDao.delete(user);
        return user;
    }



}

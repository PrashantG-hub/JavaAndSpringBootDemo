package CRUD_OPERATION.crudRepo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.stereotype.Repository;


@Getter @Setter
@Entity
@Data
@Repository
public class User {

@jakarta.persistence.Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Username;
    private int Age;
    private String Gender;
    private String Email;
    private Long PhoneNo;


}

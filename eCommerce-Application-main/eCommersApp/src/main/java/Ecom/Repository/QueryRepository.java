package Ecom.Repository;

import Ecom.Model.UserQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryRepository extends JpaRepository<UserQuery, Long> {

}

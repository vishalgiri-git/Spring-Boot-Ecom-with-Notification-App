package Ecom.Service;

import Ecom.Model.UserQuery;
import org.springframework.stereotype.Service;

@Service
public interface UserQueryService {
    public String saveQuery(UserQuery userQuery);
}

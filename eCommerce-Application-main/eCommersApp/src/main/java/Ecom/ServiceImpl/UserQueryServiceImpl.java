package Ecom.ServiceImpl;

import Ecom.Model.UserQuery;
import Ecom.Repository.QueryRepository;
import Ecom.Service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserQueryServiceImpl implements UserQueryService {

    private final QueryRepository queryRepository;

    public UserQueryServiceImpl(QueryRepository queryRepository) {
        this.queryRepository = queryRepository;
    }

    @Override
    public String saveQuery(UserQuery userQuery) {
        queryRepository.save(userQuery);
        return "Hi "+userQuery.getUserName()+
                " Your Response has been saved, we will get back to you soon";
    }
}

package upc.edu.pe.bonoapp.iam.domain.services;

import upc.edu.pe.bonoapp.iam.domain.model.aggregates.UserAdmin;
import upc.edu.pe.bonoapp.iam.domain.model.queries.GetAllUsersAdminQuery;
import upc.edu.pe.bonoapp.iam.domain.model.queries.GetUserAdminByIdQuery;
import upc.edu.pe.bonoapp.iam.domain.model.queries.GetUserAdminByUsernameQuery;

import java.util.List;
import java.util.Optional;

public interface UserAdminQueryService {
    List<UserAdmin> handle(GetAllUsersAdminQuery query);
    Optional<UserAdmin> handle(GetUserAdminByIdQuery query);
    Optional<UserAdmin> handle(GetUserAdminByUsernameQuery query);

}

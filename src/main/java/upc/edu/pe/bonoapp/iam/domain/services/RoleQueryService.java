package upc.edu.pe.bonoapp.iam.domain.services;

import upc.edu.pe.bonoapp.iam.domain.model.entities.Role;
import upc.edu.pe.bonoapp.iam.domain.model.queries.GetAllRolesQuery;
import upc.edu.pe.bonoapp.iam.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query);
    Optional<Role> handle(GetRoleByNameQuery query);
}

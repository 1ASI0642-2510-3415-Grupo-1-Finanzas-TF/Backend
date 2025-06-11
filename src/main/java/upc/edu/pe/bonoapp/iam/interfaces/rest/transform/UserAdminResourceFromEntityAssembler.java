package upc.edu.pe.bonoapp.iam.interfaces.rest.transform;

import upc.edu.pe.bonoapp.iam.domain.model.aggregates.UserAdmin;
import upc.edu.pe.bonoapp.iam.domain.model.entities.Role;
import upc.edu.pe.bonoapp.iam.interfaces.rest.resources.UserAdminResource;

public class UserAdminResourceFromEntityAssembler {
    public static UserAdminResource toResourceFromEntity(UserAdmin userAdmin) {
        var roles = userAdmin.getRoles().stream().map(Role::getStringName).toList();
        return new UserAdminResource(userAdmin.getId(), userAdmin.getUsername(), roles);
    }
}

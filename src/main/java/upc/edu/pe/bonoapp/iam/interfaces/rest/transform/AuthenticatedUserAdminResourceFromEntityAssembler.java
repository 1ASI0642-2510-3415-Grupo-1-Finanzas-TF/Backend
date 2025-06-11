package upc.edu.pe.bonoapp.iam.interfaces.rest.transform;


import upc.edu.pe.bonoapp.iam.domain.model.aggregates.UserAdmin;
import upc.edu.pe.bonoapp.iam.interfaces.rest.resources.AuthenticatedUserAdminResource;

public class AuthenticatedUserAdminResourceFromEntityAssembler {
    public static AuthenticatedUserAdminResource toResourceFromEntity(UserAdmin userAdmin, String token) {
        return new AuthenticatedUserAdminResource(userAdmin.getId(), userAdmin.getUsername(), token);
    }
}

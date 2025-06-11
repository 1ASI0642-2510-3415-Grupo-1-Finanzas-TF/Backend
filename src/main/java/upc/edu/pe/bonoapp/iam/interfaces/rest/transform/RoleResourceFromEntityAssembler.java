package upc.edu.pe.bonoapp.iam.interfaces.rest.transform;

import upc.edu.pe.bonoapp.iam.domain.model.entities.Role;
import upc.edu.pe.bonoapp.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}

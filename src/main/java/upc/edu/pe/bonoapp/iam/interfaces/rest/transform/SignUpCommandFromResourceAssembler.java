package upc.edu.pe.bonoapp.iam.interfaces.rest.transform;

import upc.edu.pe.bonoapp.iam.domain.model.commands.SignUpCommand;
import upc.edu.pe.bonoapp.iam.domain.model.entities.Role;
import upc.edu.pe.bonoapp.iam.interfaces.rest.resources.SignUpResource;

import java.util.ArrayList;

public class SignUpCommandFromResourceAssembler {
    public static SignUpCommand toCommandFromResource(SignUpResource resource) {
        var roles = resource.roles() != null ? resource.roles().stream().map(name -> Role.toRoleFromName(name)).toList() : new ArrayList<Role>();
        return new SignUpCommand(resource.username(), resource.password(), roles);
    }
}

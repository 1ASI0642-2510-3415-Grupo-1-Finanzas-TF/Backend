package upc.edu.pe.bonoapp.iam.interfaces.rest.transform;

import upc.edu.pe.bonoapp.iam.domain.model.commands.SignInCommand;
import upc.edu.pe.bonoapp.iam.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource signInResource) {
        return new SignInCommand(signInResource.username(), signInResource.password());
    }
}

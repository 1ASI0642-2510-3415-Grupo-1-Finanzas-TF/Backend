package upc.edu.pe.bonoapp.iam.domain.services;

import org.apache.commons.lang3.tuple.ImmutablePair;
import upc.edu.pe.bonoapp.iam.domain.model.aggregates.UserAdmin;
import upc.edu.pe.bonoapp.iam.domain.model.commands.SignInCommand;
import upc.edu.pe.bonoapp.iam.domain.model.commands.SignUpCommand;

import java.util.Optional;

public interface UserAdminCommandService {
    Optional<ImmutablePair<UserAdmin, String>> handle(SignInCommand command);
    Optional<UserAdmin> handle(SignUpCommand command);


}

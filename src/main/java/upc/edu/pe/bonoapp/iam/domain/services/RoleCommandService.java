package upc.edu.pe.bonoapp.iam.domain.services;

import upc.edu.pe.bonoapp.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}

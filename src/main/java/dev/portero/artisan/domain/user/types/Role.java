package dev.portero.artisan.domain.user.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum Role {

    CLIENT(Set.of()),
    VENDOR(Set.of()),
    ADMIN(
            Set.of(
                    Permission.ADMIN_READ,
                    Permission.ADMIN_UPDATE,
                    Permission.ADMIN_DELETE,
                    Permission.ADMIN_CREATE
            )
    );

    private final Set<Permission> permissions;
}

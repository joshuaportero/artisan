package dev.portero.artisan.domain.user.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {

    VENDOR_READ("vendor:product:read"),
    VENDOR_UPDATE("vendor:product:update"),
    VENDOR_DELETE("vendor:product:delete"),
    VENDOR_CREATE("vendor:product:create"),

    ADMIN_READ("admin:product:read"),
    ADMIN_UPDATE("admin:product:update"),
    ADMIN_DELETE("admin:product:delete"),
    ADMIN_CREATE("admin:product:create");

    private final String permission;
}

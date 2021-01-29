package com.github.information.entity;

/**
 * @author mingyux
 */
public class Permissions {
    private boolean admin;
    private boolean push;
    private boolean pull;

    public Permissions(boolean admin, boolean push, boolean pull) {
        this.admin = admin;
        this.push = push;
        this.pull = pull;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }

    public boolean isPull() {
        return pull;
    }

    public void setPull(boolean pull) {
        this.pull = pull;
    }
}

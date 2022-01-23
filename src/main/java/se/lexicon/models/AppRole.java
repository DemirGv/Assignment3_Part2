package se.lexicon.models;

public enum AppRole {

    ROLE_APP_USER("0"),
    ROLE_APP_ADMIN("00");

    private final String idPrefix;

    AppRole(String idPrefix) {
        this.idPrefix = idPrefix;
    }

    public String getIdPrefix() {
        return idPrefix;
    }
}

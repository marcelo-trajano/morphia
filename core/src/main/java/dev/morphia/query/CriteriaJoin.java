package dev.morphia.query;

/**
 * Defines how to combine lists of criteria.
 */
@Deprecated
public enum CriteriaJoin {
    AND,
    OR;

    @Override
    public String toString() {
        return "$" + name().toLowerCase();
    }
}

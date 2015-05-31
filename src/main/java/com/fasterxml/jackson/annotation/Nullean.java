package com.fasterxml.jackson.annotation;

/**
 * Nullable Boolean value, "nullean". Needed just because Java annotations
 * can not take 'null' as a value (even as default), so there is no
 * way to distinguish between explicit `true` and `false`, and lack of
 * choice (related: annotations are limited to primitives, so
 * {@link java.lang.Boolean} not allowed as solution).
 *<p>
 * Note: although use of `true` and `false` would be more convenient, they
 * can not be chosen since they are Java keyword and compiler won't allow
 * the choice. And since enum naming convention suggests all-upper-case,
 * that is what is done here.
 *
 * @since 2.6
 */
public enum Nullean
{
    /**
     * Value that indicates that the annotation property is explicitly defined to
     * be enabled, or true.
     */
    TRUE,
    
    /**
     * Value that indicates that the annotation property is explicitly defined to
     * be disabled, or false.
     */
    FALSE,

    /**
     * Value that indicates that the annotation property does NOT have an explicit
     * definition of enabled/disabled (or true/false); instead, a higher-level
     * configuration value is used; or lacking higher-level global setting,
     * default.
     */
    DEFAULT;
}

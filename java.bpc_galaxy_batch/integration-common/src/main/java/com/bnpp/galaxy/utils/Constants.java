package com.bnpp.galaxy.utils;

public final class Constants {

    private Constants() {
        // restrict instantiation
    }

    public static final String TRUE = "true";
    public static final String AUTO = "AUTO";
    public static final String SQL_PREFIX = "flyway.sql.script.prefix";
    public final static String UNIT_NAME = "my-unit";
    public final static String PACKAGE_ENTITIES = "com.bnpp.galaxy.entities";
    public final static String CONNECTION_TEST_STATEMENT = "select 1 from DUAL";

    public static final String INFO_DB_INIT_START = "STARTING OF DATABASE INITIALISATION";
    public static final String INFO_DB_INIT = "Initialization of the DB Schema";
    public static final String INFO_DB_INIT_SUCCESS = "Initialization of the DB Schema succeeded";
    public static final String ERROR_DB_INIT = "Error while initializing the database schema";
    public static final String ERROR_DRIVER = "No driver found in classpath";


    public static final String INFO_DB_TB_INIT = "Database tables update";
    public static final String INFO_DB_TB_INIT_SUCCESS = "Database tables successfully updated";
    public static final String ERROR_DB_TB_INIT = "Error while updating the database";

    public static final String INFO_JPA_PROPS_LOAD = "Hibernate JPA properties loaded";
    public static final String INFO_JPA_ADAPTER_LOAD = "Hibernate JPA Adapter loaded";


    public static final String INFO_TIME_WEAVER_LOAD = "Spring Load Time Weaver loaded";
    public static final String INFO_DB_SCHEMA_MIGRATED = "Database Schema migrated by Flyway";

    public static final String INFO_ENTITY_MANAGER_LOADED = "Spring Container of EntityManagerFactory loaded";
    public static final String INFO_DB_INIT_END = "END OF DATABASE INITIALISATION";

    public static final String INFO_BONE_CP_LOADED = "Bone-CP Configuration loaded";
    public static final String INFO_BONE_DATASOURCE_LOADED = "DB - Bone-CP DataSource loaded";

    public static final String PROPS_HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String PROPS_HIBERNATE_HBM = "hibernate.hbm2ddl.auto";
    public static final String PROPS_HIBERNATE_LAZY_LOAD = "hibernate.enable_lazy_load_no_trans";
    public static final String PROPS_HIBERNATE_FLUSH_MODE = "org.hibernate.flushMode";
    public static final String PROPS_DB_VENDOR = "database.vendor";
    public static final String PROPS_HIBERNATE_SHOW_SQL = "hibernate.show.sql";
    public static final String PROPS_JDBC_DRIVER = "batch.jdbc.driver";
    public static final String PROPS_JDBC_URL = "batch.jdbc.url";
    public static final String PROPS_JDBC_USER = "batch.jdbc.user";
    public static final String PROPS_JDBC_PWD = "batch.jdbc.password";


}
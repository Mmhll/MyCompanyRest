CREATE TABLE IF NOT EXISTS chats (
                              id integer NOT NULL,
                              title character varying(100),
                              type_of_chat character varying(20),
                              created_at timestamp without time zone,
                              updated_at timestamp without time zone
);


CREATE TABLE IF NOT EXISTS company_roles (
                                      id integer NOT NULL,
                                      role_name character varying(24)
);

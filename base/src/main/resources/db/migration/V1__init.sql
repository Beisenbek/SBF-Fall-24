CREATE TABLE IF NOT EXISTS public.employees
(
    date_of_birth date,
    id integer NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT employees_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.employees
    OWNER to postgres;


--DROP USER pos_journal_demo_user
CREATE USER pos_journal_demo_user WITH PASSWORD 'c@mel_user';


-- Table: journal

-- DROP TABLE journal;

CREATE TABLE journal
(
  journal_id serial NOT NULL,
  journal_datetime time without time zone NOT NULL,
  site_id integer NOT NULL,
  site_name character varying(50) NOT NULL,
  commission_operatorid integer NOT NULL,
  commission_operator character varying(50) NOT NULL,
  item_id integer NOT NULL,
  item_name character varying(50) NOT NULL,
  item_price numeric NOT NULL,
  item_quantity numeric NOT NULL,
  CONSTRAINT journal_pkey PRIMARY KEY (journal_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE journal
  OWNER TO postgres;
GRANT ALL ON TABLE journal TO postgres;
GRANT ALL ON TABLE journal TO pos_journal_demo_user;
GRANT ALL ON SEQUENCE journal_journal_id_seq TO pos_journal_demo_user;


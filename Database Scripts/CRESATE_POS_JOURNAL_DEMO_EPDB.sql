


-- Database: "POS_JOURNAL_DEMO_EPDB"

/*
SELECT pg_terminate_backend(pg_stat_activity.pid)
FROM pg_stat_activity
WHERE pg_stat_activity.datname = 'POS_JOURNAL_DEMO_EPDB'
  AND pid <> pg_backend_pid();
DROP DATABASE "POS_JOURNAL_DEMO_EPDB";
*/

CREATE DATABASE "POS_JOURNAL_DEMO_EPDB"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United Kingdom.1252'
       LC_CTYPE = 'English_United Kingdom.1252'
       CONNECTION LIMIT = -1;




POS Journal Demo
======================

This project contains three camel routes. The first POSJournalFileReceiver picks up XML files from a folder and places them on a topic. The second, POSJournalEmailReceiver picks up CSV attachments from Emails sent to an email address and places them on a topic. The third, POSJournal Loader subscribes to the topic and persists the records into a Postgres Database table.

Installation
------------

1. Install Postgres if you don't have it
2. Run Database Scripts/CREATE_POS_JOURNAL_DEMO_EPDB.sql
3. Connect to the newly created database and run Database Scripts/CREATE_JOURNAL_TABLE.sql
4. Download Postgres JDBC from https://jdbc.postgresql.org/download.html and place in deploy folder of your Fuse installation
5. Make sure camel-sql is installed. If not: features:install camel-sql
6. Make sure camel-dozer is intalled. If not: features:install camel-dozer
7. Log into localhost:8181/hawtio/ and create a new topic named loadPOSJournal
7. Run mvn install for each of the camel routes to create the Target folders
8. Copy the jar files within the Target folders into the Deploy folder of your Fuse installation
9. Check the routes are running in the logs of the Fuse console localhost:8181/hawtio/

Running
-------

POSJournalFileReceiver. Copy file from src/main/data and place in work/input folder within your fuse installation. Record will appear in Journal Table 

POSJournalEmailReceiver. Send an email with attachment to 'estafet.posjournal.demo@gmail.com' with 'Camel' as the subject. Attach the CSV from the src/main/data folder. Multiple files can be attached. Record will appear in Journal Table. Multilined CSVs not currently supported.

Video
-----

A brief overview video (Also including a short overview of Fuse and Camel) can be found here:
https://drive.google.com/drive/u/0/folders/0BzNZnPW_50dWUnh3YnU5b3lwYm8
(Estafet only access only)
This is a work in progress and when finalised will be published wider.

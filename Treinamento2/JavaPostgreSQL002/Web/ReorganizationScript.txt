CREATE SEQUENCE serv_lot_id MINVALUE 1 INCREMENT 1;
CREATE TABLE ServLotado (serv_lot_id integer NOT NULL DEFAULT nextval('serv_lot_id'), serv_lot_idade smallint , serv_lot_unid VARCHAR(40) , serv_lot_foto VARCHAR(40) , unid_id integer NOT NULL , PRIMARY KEY(serv_lot_id));
CREATE INDEX ISERVLOTADO1 ON ServLotado (unid_id );

ALTER TABLE ServLotado ADD CONSTRAINT ISERVLOTADO1 FOREIGN KEY (unid_id) REFERENCES Unidade (unid_id);


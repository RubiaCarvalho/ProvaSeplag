CREATE TABLE unidade_endereco (unidade_id integer NOT NULL , endereco_id integer NOT NULL , PRIMARY KEY(unidade_id));
CREATE INDEX IUNIDADE_ENDERECO1 ON unidade_endereco (endereco_id );

CREATE TABLE servidor_efetivo (se_pes_id integer NOT NULL , se_matricula VARCHAR(20) , PRIMARY KEY(se_pes_id));

CREATE TABLE servidor_temporario (st_pes_id integer NOT NULL , st_data_admissao date NOT NULL , st_data_demissao date NOT NULL , PRIMARY KEY(st_pes_id));

CREATE TABLE pessoa_endereco (pessoa_id integer NOT NULL , endereco_id integer NOT NULL , PRIMARY KEY(pessoa_id));
CREATE INDEX ITRANSACTION2 ON pessoa_endereco (endereco_id );

CREATE SEQUENCE unid_id MINVALUE 1 INCREMENT 1;
CREATE TABLE Unidade (unid_id integer NOT NULL DEFAULT nextval('unid_id'), unid_nome VARCHAR(200) , unid_sigla VARCHAR(20) , PRIMARY KEY(unid_id));
CREATE UNIQUE INDEX UUNIDADE ON Unidade (unid_nome );

CREATE SEQUENCE pes_id MINVALUE 1 INCREMENT 1;
CREATE TABLE Pessoa (pes_id integer NOT NULL DEFAULT nextval('pes_id'), pes_nome VARCHAR(200) , pes_data_nascimento date , pes_sexo VARCHAR(9) , pes_mae VARCHAR(200) , pes_pai VARCHAR(200) , PRIMARY KEY(pes_id));

CREATE SEQUENCE lot_id MINVALUE 1 INCREMENT 1;
CREATE TABLE lotacao (lot_id integer NOT NULL DEFAULT nextval('lot_id'), pes_id integer NOT NULL , unid_id integer NOT NULL , lot_data_lotacao date , lot_data_remocao date , lot_portaria VARCHAR(100) , PRIMARY KEY(lot_id));
CREATE INDEX ILOTACAO2 ON lotacao (pes_id );
CREATE INDEX ILOTACAO1 ON lotacao (unid_id );

CREATE SEQUENCE fp_id MINVALUE 1 INCREMENT 1;
CREATE TABLE foto_pessoa (fp_id integer NOT NULL DEFAULT nextval('fp_id'), pes_id integer NOT NULL , fp_data date , fp_bucket VARCHAR(50) , fp_hash VARCHAR(50) , PRIMARY KEY(fp_id));
CREATE INDEX IFOTO_PESSOA1 ON foto_pessoa (pes_id );

CREATE SEQUENCE end_id MINVALUE 1 INCREMENT 1;
CREATE TABLE Endereco (end_id integer NOT NULL DEFAULT nextval('end_id'), end_tipo_logradouro VARCHAR(50) , end_logradouro VARCHAR(200) , end_numero smallint , end_bairro VARCHAR(100) , cid_id integer , PRIMARY KEY(end_id));
CREATE INDEX IENDERECO1 ON Endereco (cid_id );

CREATE SEQUENCE cid_id MINVALUE 1 INCREMENT 1;
CREATE TABLE Cidade (cid_id integer NOT NULL DEFAULT nextval('cid_id'), cid_nome VARCHAR(200) NOT NULL , cid_uf CHAR(2) NOT NULL , PRIMARY KEY(cid_id));

ALTER TABLE Endereco ADD CONSTRAINT IENDERECO1 FOREIGN KEY (cid_id) REFERENCES Cidade (cid_id);

ALTER TABLE foto_pessoa ADD CONSTRAINT IFOTO_PESSOA1 FOREIGN KEY (pes_id) REFERENCES Pessoa (pes_id);

ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO2 FOREIGN KEY (pes_id) REFERENCES Pessoa (pes_id);
ALTER TABLE lotacao ADD CONSTRAINT ILOTACAO1 FOREIGN KEY (unid_id) REFERENCES Unidade (unid_id);

ALTER TABLE pessoa_endereco ADD CONSTRAINT ITRANSACTION1 FOREIGN KEY (pessoa_id) REFERENCES Pessoa (pes_id);
ALTER TABLE pessoa_endereco ADD CONSTRAINT ITRANSACTION2 FOREIGN KEY (endereco_id) REFERENCES Endereco (end_id);

ALTER TABLE servidor_temporario ADD CONSTRAINT ISERVIDOR_TEMPORARIO FOREIGN KEY (st_pes_id) REFERENCES Pessoa (pes_id);

ALTER TABLE servidor_efetivo ADD CONSTRAINT ISERVIDOR_EFETIVO FOREIGN KEY (se_pes_id) REFERENCES Pessoa (pes_id);

ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO FOREIGN KEY (unidade_id) REFERENCES Unidade (unid_id);
ALTER TABLE unidade_endereco ADD CONSTRAINT IUNIDADE_ENDERECO1 FOREIGN KEY (endereco_id) REFERENCES Endereco (end_id);


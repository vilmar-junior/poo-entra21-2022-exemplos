CREATE TABLE `vacinas`.`vacina` (
  `pais_origem` VARCHAR(300) NOT NULL,
  `estagio_pesquisa` INT NOT NULL,
  `data_inicio_pesquisa` DATE NOT NULL,
  `nome_responsavel` VARCHAR(300) NOT NULL);
  
ALTER TABLE `vacinas`.`vacina` 
ADD COLUMN `id` INT NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (`id`);

CREATE TABLE `vacinas`.`pesquisador` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `matricula` INT NOT NULL,
  `data_nascimento` DATE NOT NULL,
  PRIMARY KEY (`id`));
  
ALTER TABLE `vacinas`.`vacina` 
ADD COLUMN `id_responsavel` INT NULL;  
  
UPDATE `vacinas`.`vacina` SET `id_responsavel` = '1' WHERE (`id` = '3');
UPDATE `vacinas`.`vacina` SET `id_responsavel` = '2' WHERE (`id` = '4');
UPDATE `vacinas`.`vacina` SET `id_responsavel` = '3' WHERE (`id` = '5');
  
INSERT INTO VACINAS.PESQUISADOR(NOME, CPF, MATRICULA, DATA_NASCIMENTO)
VALUES('Edson Arantes do Nascimento', '00011122210', 10, '1940-03-21');

INSERT INTO VACINAS.PESQUISADOR(NOME, CPF, MATRICULA, DATA_NASCIMENTO)
VALUES('Marcos André', '00011122205', 5, '1980-05-05');

INSERT INTO VACINAS.PESQUISADOR(NOME, CPF, MATRICULA, DATA_NASCIMENTO)
VALUES('Ronaldinho Gaúcho', '00011122280', 80, '1980-05-05');

ALTER TABLE `vacinas`.`vacina` 
ADD CONSTRAINT `id_responsavel`
  FOREIGN KEY (`id_responsavel`)
  REFERENCES `vacinas`.`pesquisador` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `vacinas`.`vacina` DROP COLUMN `nome_responsavel`;


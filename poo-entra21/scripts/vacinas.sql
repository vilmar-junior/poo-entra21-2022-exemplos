CREATE TABLE `vacinas`.`vacina` (
  `pais_origem` VARCHAR(300) NOT NULL,
  `estagio_pesquisa` INT NOT NULL,
  `data_inicio_pesquisa` DATE NOT NULL,
  `nome_responsavel` VARCHAR(300) NOT NULL);
  
ALTER TABLE `vacinas`.`vacina` 
ADD COLUMN `id` INT NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (`id`);

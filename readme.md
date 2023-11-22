# Projeto Spring Boot - Universidade

Este é um projeto Spring Boot desenvolvido em Java 17 para gerenciar cursos de uma universidade. O projeto utiliza um banco de dados MySQL (ou outro banco compatível) para armazenar informações sobre as disciplinas oferecidas.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- Java 17
- Maven
- Banco de dados MySQL 

## Configuração do Banco de Dados

Antes de executar a aplicação, execute os seguintes scripts SQL no seu banco de dados para popular a tabela `Disciplina`:

### Script 

```sql
-- Script 1
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Inteligência Artificial', 'Eduardo Lima', 80, 'obrigatória', 'presencial');

-- Script 2
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento Mobile', 'Maria Ferreira', 75, 'obrigatória', 'presencial');

-- Script 3
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologias Web', 'Gabriel Souza', 70, 'obrigatória', 'presencial');

-- Script 4
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Sistemas Distribuídos', 'Patrícia Santos', 75, 'obrigatória', 'presencial');

-- Script 5
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Machine Learning', 'Matheus Oliveira', 80, 'obrigatória', 'presencial');

-- Script 6
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Arquitetura de Computadores', 'Letícia Garcia', 70, 'obrigatória', 'presencial');

-- Script 7
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Governança de TI', 'Rafaela Almeida', 75, 'obrigatória', 'presencial');

-- Script 8
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento Ágil', 'Leonardo Fernandes', 70, 'obrigatória', 'presencial');

-- Script 9
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Banco de Dados Avançado', 'Ana Paula Lima', 75, 'obrigatória', 'presencial');

-- Script 10
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Redes de Computadores Avançadas', 'Gustavo Oliveira', 80, 'obrigatória', 'presencial');

-- Script 11
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Dados', 'Mariana Ferreira', 75, 'obrigatória', 'presencial');

-- Script 12
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Segurança da Informação', 'Rodrigo Castro', 80, 'obrigatória', 'presencial');

-- Script 13
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Estratégia de TI', 'Carla Vieira', 70, 'obrigatória', 'presencial');

-- Script 14
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Administração de Sistemas', 'Paulo Miranda', 75, 'obrigatória', 'presencial');

-- Script 15
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologia Blockchain', 'Fernanda Costa', 80, 'obrigatória', 'presencial');

-- Script 16
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Design de Interfaces', 'Diego Ferreira', 70, 'obrigatória', 'presencial');

-- Script 17
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Computação Gráfica', 'Lúcia Andrade', 75, 'obrigatória', 'presencial');

-- Script 18
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Programação Funcional', 'André Castro', 80, 'obrigatória', 'presencial');

-- Script 19
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Projetos de TI', 'Isabela Almeida', 75, 'obrigatória', 'presencial');

-- Script 20
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Computação Quântica', 'Ricardo Santos', 80, 'obrigatória', 'presencial');

-- Script 21
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Administração de Bancos de Dados', 'Lucas Oliveira', 75, 'obrigatória', 'presencial');

-- Script 22
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento de Software', 'Natália Garcia', 80, 'obrigatória', 'presencial');

-- Script 23
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Cloud Computing', 'Pedro Almeida', 70, 'obrigatória', 'presencial');

-- Script 24
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Requisitos', 'Fernando Souza', 75, 'obrigatória', 'presencial');

-- Script 25
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Big Data Analytics', 'Bianca Ferreira', 80, 'obrigatória', 'presencial');

-- Script 26
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão da Inovação em TI', 'Vitor Santos', 70, 'obrigatória', 'presencial');

-- Script 27
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Modelagem de Dados', 'Carolina Oliveira', 75, 'obrigatória', 'presencial');

-- Script 28
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Robótica', 'Gustavo Almeida', 80, 'obrigatória', 'presencial');

-- Script 29
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Segurança da Informação', 'Tatiana Costa', 70, 'obrigatória', 'presencial');

-- Script 30
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento de Jogos', 'Bruno Ferreira', 75, 'obrigatória', 'presencial');

-- Script 31
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Análise e Projeto de Sistemas', 'Amanda Santos', 80, 'obrigatória', 'presencial');

-- Script 32
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Software', 'Rafael Oliveira', 70, 'obrigatória', 'presencial');

-- Script 33
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('E-commerce e Negócios Online', 'Natália Almeida', 75, 'obrigatória', 'presencial');

-- Script 34
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Inteligência de Negócios', 'Eduardo Santos', 80, 'obrigatória', 'presencial');

-- Script 35
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologia da Informação e Sociedade', 'Marina Ferreira', 70, 'obrigatória', 'presencial');

-- Script 36
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Projetos de Tecnologia', 'Andréia Oliveira', 75, 'obrigatória', 'presencial');

-- Script 37
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Ética e Direito Digital', 'Diego Santos', 80, 'obrigatória', 'presencial');

-- Script 38
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Sistemas de Informação', 'Fernanda Almeida', 70, 'obrigatória', 'presencial');

-- Script 39
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologias Emergentes', 'Gabriel Oliveira', 75, 'obrigatória', 'presencial');

-- Script 40
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento de Aplicações Web', 'Mariana Souza', 80, 'obrigatória', 'presencial');

-- Script 41
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Inteligência Artificial', 'Lucas Ferreira', 70, 'obrigatória', 'presencial');

-- Script 42
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Segurança em Redes', 'Nathalia Almeida', 75, 'obrigatória', 'presencial');

-- Script 43
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Arquitetura de Computadores', 'Rafael Santos', 80, 'obrigatória', 'presencial');

-- Script 44
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Machine Learning', 'Julia Oliveira', 70, 'obrigatória', 'presencial');

-- Script 45
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Redes de Computadores', 'Matheus Almeida', 75, 'obrigatória', 'presencial');

-- Script 46
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Sistemas Operacionais', 'Isabela Ferreira', 80, 'obrigatória', 'presencial');

-- Script 47
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Programação Orientada a Objetos', 'Pedro Oliveira', 70, 'obrigatória', 'presencial');

-- Script 48
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Banco de Dados', 'Luana Almeida', 75, 'obrigatória', 'presencial');

-- Script 49
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Cibersegurança', 'Diego Ferreira', 80, 'obrigatória', 'presencial');

-- Script 50
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento Mobile', 'Carolina Santos', 70, 'obrigatória', 'presencial');

-- Script 51
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Tecnologia da Informação', 'Vitor Ferreira', 75, 'obrigatória', 'presencial');

-- Script 52
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Internet das Coisas', 'Juliana Almeida', 80, 'obrigatória', 'presencial');

-- Script 53
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Software Ágil', 'Gabriel Santos', 70, 'obrigatória', 'presencial');

-- Script 54
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Economia Digital', 'Fernanda Oliveira', 75, 'obrigatória', 'presencial');

-- Script 55
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Projetos em TI', 'Lucas Almeida', 80, 'obrigatória', 'presencial');

-- Script 56
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Programação Funcional', 'Mariana Ferreira', 70, 'obrigatória', 'presencial');

-- Script 57
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Computação Gráfica', 'Gustavo Oliveira', 75, 'obrigatória', 'presencial');

-- Script 58
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Empreendedorismo em TI', 'Amanda Almeida', 80, 'obrigatória', 'presencial');

-- Script 59
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tópicos Avançados em TI', 'Bruno Santos', 70, 'obrigatória', 'presencial');

-- Script 60
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Fundamentos de Inteligência Computacional', 'Tatiana Oliveira', 75, 'obrigatória', 'presencial');

-- Script 61
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Redes e Serviços', 'Pedro Ferreira', 80, 'obrigatória', 'presencial');

-- Script 62
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Análise de Sistemas', 'Carla Almeida', 70, 'obrigatória', 'presencial');

-- Script 63
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Informática na Educação', 'Rafael Ferreira', 75, 'obrigatória', 'presencial');

-- Script 64
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Software Experimental', 'Luana Santos', 80, 'obrigatória', 'presencial');

-- Script 65
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Modelagem de Sistemas', 'Diego Oliveira', 70, 'obrigatória', 'presencial');

-- Script 66
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Redes Sem Fio', 'Gabriela Ferreira', 75, 'obrigatória', 'presencial');

-- Script 67
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Computação em Nuvem', 'Ricardo Santos', 80, 'obrigatória', 'presencial');

-- Script 68
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Testes de Software', 'Mariana Oliveira', 70, 'obrigatória', 'presencial');

-- Script 69
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Estrutura de Dados', 'Vitoria Ferreira', 75, 'obrigatória', 'presencial');

-- Script 70
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão da Informação', 'Anderson Santos', 80, 'obrigatória', 'presencial');

-- Script 71
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Algoritmos e Lógica de Programação', 'Carla Oliveira', 70, 'obrigatória', 'presencial');

-- Script 72
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Big Data Analytics', 'Pedro Almeida', 75, 'obrigatória', 'presencial');

-- Script 73
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Computação Gráfica', 'Isabela Santos', 80, 'obrigatória', 'presencial');

-- Script 74
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento Web', 'Lucas Oliveira', 70, 'obrigatória', 'presencial');

-- Script 75
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Ética em TI', 'Natalia Ferreira', 75, 'obrigatória', 'presencial');

-- Script 76
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gerenciamento de Projetos em TI', 'Gustavo Almeida', 80, 'obrigatória', 'presencial');

-- Script 77
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Programação', 'Juliana Santos', 70, 'obrigatória', 'presencial');

-- Script 78
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Machine Learning Aplicado', 'Rafael Oliveira', 75, 'obrigatória', 'presencial');

-- Script 79
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Sistemas Distribuídos', 'Bruno Almeida', 80, 'obrigatória', 'presencial');

-- Script 80
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologia da Informação e Comunicação', 'Tatiana Ferreira', 70, 'obrigatória', 'presencial');

-- Script 81
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Blockchain e Criptomoedas', 'Matheus Santos', 75, 'obrigatória', 'presencial');

-- Script 82
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Design de Interface', 'Gabriela Oliveira', 80, 'obrigatória', 'presencial');

-- Script 83
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Engenharia de Requisitos', 'Diego Almeida', 70, 'obrigatória', 'presencial');

-- Script 84
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Sistemas de Informação', 'Carolina Ferreira', 75, 'obrigatória', 'presencial');

-- Script 85
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Introdução à Robótica', 'Vitor Oliveira', 80, 'obrigatória', 'presencial');

-- Script 86
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Mineração de Dados', 'Julia Almeida', 70, 'obrigatória', 'presencial');

-- Script 87
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Redes Sociais e Web Analytics', 'Ricardo Ferreira', 75, 'obrigatória', 'presencial');

-- Script 88
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Segurança da Informação', 'Mariana Almeida', 80, 'obrigatória', 'presencial');

-- Script 89
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Sistemas de Informação Gerencial', 'Anderson Oliveira', 70, 'obrigatória', 'presencial');

-- Script 90
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologias Emergentes', 'Carla Santos', 75, 'obrigatória', 'presencial');

-- Script 91
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Telecomunicações', 'Pedro Ferreira', 80, 'obrigatória', 'presencial');

-- Script 92
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão de Riscos em TI', 'Isabela Almeida', 70, 'obrigatória', 'presencial');

-- Script 93
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Negócios Digitais', 'Lucas Santos', 75, 'obrigatória', 'presencial');

-- Script 94
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Computação Forense', 'Natalia Oliveira', 80, 'obrigatória', 'presencial');

-- Script 95
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Desenvolvimento Ágil de Software', 'Gustavo Almeida', 70, 'obrigatória', 'presencial');

-- Script 96
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Fundamentos de Hardware', 'Juliana Ferreira', 75, 'obrigatória', 'presencial');

-- Script 97
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Gestão da Tecnologia da Informação', 'Rafael Almeida', 80, 'obrigatória', 'presencial');

-- Script 98
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Redes Neurais', 'Mariana Santos', 70, 'obrigatória', 'presencial');

-- Script 99
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologia e Inovação', 'Diego Oliveira', 75, 'obrigatória', 'presencial');

-- Script 100
INSERT INTO universidade.Disciplina (nome, professor, carga_horaria, tipo_Disciplina, modalidade)
VALUES ('Tecnologias de Informação e Comunicação', 'Carolina Almeida', 80, 'obrigatória', 'presencial');
```

Após a execução desses scripts, o banco de dados estará populado com as disciplinas.


## Observação

Certifique-se de configurar corretamente as informações do banco de dados no arquivo `application.properties` do projeto. Caso contrário, a aplicação não conseguirá se conectar ao banco.

Para mais informações sobre a configuração do Spring Boot, consulte a [documentação oficial](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config).
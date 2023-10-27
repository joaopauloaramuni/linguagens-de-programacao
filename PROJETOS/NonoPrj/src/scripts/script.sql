-- Criando a tabela Livro
CREATE TABLE [Livro]
(
    [LivroId] INTEGER  NOT NULL,
    [Titulo] NVARCHAR(160)  NOT NULL,
    [Autor] NVARCHAR(160)  NOT NULL,
    [ISBN] NVARCHAR(160)  NOT NULL,
    [Quantidade] INTEGER  NOT NULL,
    CONSTRAINT [PK_Livro] PRIMARY KEY ([LivroId])
);

CREATE UNIQUE INDEX [IPK_Livro] ON [Livro]([LivroId]);

-- Criando a tabela Aluno
CREATE TABLE [Aluno]
(
    [Matricula] INTEGER  NOT NULL,
    [Nome] NVARCHAR(160)  NOT NULL,
    CONSTRAINT [PK_Aluno] PRIMARY KEY ([Matricula])
);

CREATE UNIQUE INDEX [IPK_Aluno] ON [Aluno]([Matricula]);

-- Criando a tabela Emprestimo
CREATE TABLE [Emprestimo]
(
    [EmprestimoId] INTEGER  NOT NULL,
    [LivroId] INTEGER  NOT NULL,
    [Matricula] INTEGER  NOT NULL,
    [DataHora_Emprestimo] DATETIME NOT NULL,
    CONSTRAINT [PK_Emprestimo] PRIMARY KEY ([EmprestimoId]),
    CONSTRAINT [FK_Emprestimo_Livro] FOREIGN KEY ([LivroId]) REFERENCES Livro(LivroId),
    CONSTRAINT [FK_Emprestimo_Aluno] FOREIGN KEY ([Matricula]) REFERENCES Aluno(Matricula)
);

CREATE UNIQUE INDEX [IPK_Emprestimo] ON [Emprestimo]([EmprestimoId]);

-- Para deletar as tabelas:
DROP TABLE Livro;
DROP TABLE Aluno;
DROP TABLE Emprestimo;

-- CRUD (Create, Read, Update and Delete)

-- INSERT

-- Inserindo um registro na tabela Livro
INSERT INTO Livro (LivroId, Titulo, Autor, ISBN, Quantidade)
VALUES (1, 'Introdução aos Fundamentos da Computação', 'Newton José Vieira', 'ISBN 123456', 10);

-- Inserindo um registro na tabela Aluno
INSERT INTO Aluno (Matricula, Nome)
VALUES (1, 'Aramuni');

-- Inserindo um registro na tabela Emprestimo
INSERT INTO Emprestimo (EmprestimoId, LivroId, Matricula, DataHora_Emprestimo)
VALUES (1, 1, 1, '2023-07-08 19:00:00');

-- SELECT
SELECT * FROM Livro WHERE Titulo LIKE 'Introdução%';
SELECT * FROM Aluno WHERE Nome LIKE 'Ara%';
SELECT * FROM Emprestimo WHERE LivroId LIKE '%1'

-- UPDATE 
UPDATE Livro SET Titulo = 'Introdução aos Compiladores' WHERE LivroId  = 1;
UPDATE Aluno SET Nome = 'João Paulo' WHERE Matricula = 1;
UPDATE Emprestimo SET DataHora_Emprestimo = '2023-07-08 22:00:00' WHERE EmprestimoId = 1;

-- DELETE
DELETE FROM Emprestimo WHERE EmprestimoId = 1;
DELETE FROM Aluno WHERE Matricula = 1;
DELETE FROM Livro WHERE LivroId = 1;

-- INNER JOIN
SELECT e.EmprestimoId, l.Titulo, a.Nome
FROM Emprestimo e
INNER JOIN Livro l ON e.LivroId = l.LivroId
INNER JOIN Aluno a ON e.Matricula = a.Matricula;

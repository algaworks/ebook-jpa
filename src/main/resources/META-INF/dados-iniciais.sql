insert into proprietario (codigo, nome) values (1, 'Fernando Martins');
insert into proprietario (codigo, nome) values (2, 'Isabela Santos');
insert into proprietario (codigo, nome) values (3, 'Ulisses Silva');

insert into proprietario_telefone (proprietario_codigo, prefixo, telefone_numero, ramal) values (1, '34', '9 1111 1111', '1');
insert into proprietario_telefone (proprietario_codigo, prefixo, telefone_numero, ramal) values (2, '34', '9 2222 2222', null);
insert into proprietario_telefone (proprietario_codigo, prefixo, telefone_numero, ramal) values (3, '34', '9 3333 3333', null);

insert into tab_veiculo (codigo, fabricante, modelo, ano_fabricacao, ano_modelo, valor, tipo_combustivel, data_cadastro, proprietario_codigo) values (1, 'Fiat', 'Toro', 2020, 2020, 107000, 'DIESEL', sysdate(), 1);
insert into tab_veiculo (codigo, fabricante, modelo, ano_fabricacao, ano_modelo, valor, tipo_combustivel, data_cadastro, proprietario_codigo) values (2, 'Ford', 'Fiesta', 2019, 2019, 42000, 'GASOLINA', sysdate(), 2);
insert into tab_veiculo (codigo, fabricante, modelo, ano_fabricacao, ano_modelo, valor, tipo_combustivel, data_cadastro, proprietario_codigo) values (3, 'VW', 'Gol', 2019, 2020, 35000, 'BICOMBUSTIVEL', sysdate(), 3);
insert into tab_veiculo (codigo, fabricante, modelo, ano_fabricacao, ano_modelo, valor, tipo_combustivel, data_cadastro, proprietario_codigo) values (4, 'Ford', 'Ka', 2018, 2019, 27000, 'BICOMBUSTIVEL', sysdate(), 1);

insert into acessorio (codigo, descricao) values (1, 'Direção hidráulica');
insert into acessorio (codigo, descricao) values (2, 'Alarme');
insert into acessorio (codigo, descricao) values (3, 'Ar condicionado');
insert into acessorio (codigo, descricao) values (4, 'Bancos de couro');

insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 1);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 2);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 3);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 4);

insert into cliente (codigo, nome, bloqueado, limite_credito, renda_mensal) values (1, 'Mariana Aguilar', false, 10000, 5000);
insert into cliente (codigo, nome, bloqueado, limite_credito, renda_mensal) values (2, 'Douglas Montes', false, 8000, 4500);

insert into funcionario (codigo, nome, cargo, salario) values (3, 'Maria das Dores', 'Gerente', 8000);

insert into categoria (codigo, nome) values (1, 'Bebidas');

insert into produto (codigo, categoria_codigo, nome) values (1, 1, 'Água');
insert into produto (codigo, categoria_codigo, nome) values (2, 1, 'Refrigerante');
insert into produto (codigo, categoria_codigo, nome) values (3, 1, 'Cerveja');

insert into usuario (codigo, email, ativo, versao) values (1, 'joao@algaworks.com', true, 0);
insert into usuario (codigo, email, ativo, versao) values (2, 'manoel@algaworks.com', true, 0);
insert into usuario (codigo, email, ativo, versao) values (3, 'sebastiao123@gmail.com', true, 0);
insert into usuario (codigo, email, ativo, versao) values (4, 'marquim321@gmail.com', false, 0);

insert into centro_custo (codigo, nome) values (1, 'Tecnologia');
insert into centro_custo (codigo, nome) values (2, 'Comercial');
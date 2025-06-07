INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Oziel De Souza', '12345678912', 2500.00, '1994-10-07', 0);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Jessica De Souza', '98745612356', 4500.00, '1992-07-27', 2);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Eunice Maria', '45678912398', 3100.50, '1971-05-23', 4);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Carlos Eduardo', '12345678901', 4200.75, '1980-03-15', 2);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Fernanda Lima', '98765432100', 5500.00, '1992-08-30', 1);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('João Pedro', '23456789123', 2750.25, '1978-11-22', 3);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Ana Beatriz', '34567891234', 6900.90, '1985-07-01', 0);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Marcos Silva', '45678912345', 3800.10, '1990-12-10', 2);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Juliana Alves', '56789123456', 3200.00, '1975-06-17', 4);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Ricardo Moreira', '67891234567', 4600.30, '1982-02-28', 1);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Patrícia Gomes', '78912345678', 5000.00, '1995-09-09', 0);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('André Luiz', '89123456789', 2950.50, '1988-01-05', 2);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Luciana Rocha', '91234567890', 7300.40, '1979-04-19', 3);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Gabriel Souza', '10293847566', 6100.60, '1991-11-11', 1);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Camila Torres', '01928374655', 3400.20, '1983-05-07', 2);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Rafael Santos', '90817263544', 2800.00, '1977-08-14', 5);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Isabela Mendes', '80716253433', 4700.80, '1986-03-03', 0);
INSERT INTO tb_client (name, cpf, income, birth_date, children) VALUES ('Thiago Costa', '70615243322', 3900.90, '1993-10-21', 1);

INSERT INTO tb_department (name) VALUES ('Administrative');
INSERT INTO tb_department (name) VALUES ('Production');

INSERT INTO tb_person (name, salary, department_id) VALUES ('Ana', 5000.0, 1);
INSERT INTO tb_person (name, salary, department_id) VALUES ('James', 4000.0, 1);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Maria', 6000.0, 2);
INSERT INTO tb_person (name, salary, department_id) VALUES ('Bob', 3000.0, 2);

INSERT INTO tb_category (name) VALUES ('Books');
INSERT INTO tb_category (name) VALUES ('Eletronic');
INSERT INTO tb_category (name) VALUES ('Computers');

INSERT INTO tb_product (name, price) VALUES ('The Lord of the Rings', 90.5);
INSERT INTO tb_product (name, price) VALUES ('Smart TV', 2190.0);
INSERT INTO tb_product (name, price) VALUES ('Macbook Pro', 1250.0);
INSERT INTO tb_product (name, price) VALUES ('PC Gamer', 1200.0);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 3);


-- Criação da tabela de barbeiros
CREATE TABLE barber (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

-- Criação da tabela de agendamentos
CREATE TABLE appointment (
    id SERIAL PRIMARY KEY,
    barber_id INT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    appointment_date TIMESTAMP NOT NULL,
    CONSTRAINT fk_barber FOREIGN KEY (barber_id) REFERENCES barber(id)
);
create table cliente
(
    id   uuid         not null,
    nomeCliente varchar(100) not null,
    sexo varchar(9)  not null,
    documento varchar(14),
    endereco uuid    not null,
    constraint pk_cliente primary key (id),
    constraint fk_cliente_endereco foreign key (endereco_fk) references endereco (id)
);
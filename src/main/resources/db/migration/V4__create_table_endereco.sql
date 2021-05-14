create table endereco
(
    id   uuid         not null,
    cep varchar(8) not null,
    rua varchar(100)  not null,
    numero varchar(100) not null,
    bairro varchar(100) not null,
    complemento varchar(100) not null,
    cidade_fk uuid   not null,
    constraint pk_endereco primary key (id),
    constraint fk_cidade_endereco foreign key (cidade_fk) references cidade (id)
);
create table if not exists user
(
    id bigint(19) not null primary key ,
    name varchar(45),
    company varchar(45),
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp
);
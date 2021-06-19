create table if not exists user
(
    id          bigint(19) not null primary key auto_increment,
    name        varchar(45),
    role        varchar(45),
    account     varchar(45),
    password    varchar(225),
    create_time datetime   not null default current_timestamp,
    update_time datetime   not null default current_timestamp on update current_timestamp
);
create table if not exists lab
(
    id          bigint(19) not null primary key auto_increment,
    contain     bigint(19),
    name        varchar(45),
    description varchar(45),
    room        varchar(45)
);
create table if not exists booking_rec
(
    id             bigint(19) not null primary key auto_increment,
    user_id        bigint(19),
    lab_id         bigint(19),
    section        bigint(19),
    date           datetime,
    foreign key (user_id) references user(id),
    foreign key (lab_id) references lab(id),
    create_time datetime   not null default current_timestamp,
    update_time datetime   not null default current_timestamp on update current_timestamp

);
create table if not exists booking_desc
(
    id         bigint(19) not null primary key auto_increment,
    user_id    bigint(19),
    lab_id     bigint(19),
    s1         boolean,
    s2         boolean,
    s3         boolean,
    s4         boolean,
    s5         boolean,
    start_date datetime,
    end_date   datetime,
    foreign key (user_id) references user(id),
    foreign key (lab_id) references lab(id)
);
create table if not exists booking
(
    id     bigint(19) not null primary key auto_increment,
    lab_id bigint(19),
    s1     boolean,
    s2     boolean,
    s3     boolean,
    s4     boolean,
    s5     boolean,
    date   datetime,
    foreign key (lab_id) references lab(id)
);
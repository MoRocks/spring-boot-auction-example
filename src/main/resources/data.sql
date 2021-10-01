DROP TABLE IF EXISTS Admin;

create table Admin
(
    Id       bigserial
        constraint admin_pk
            primary key,
    User_Id  char(60),
    Password char(60),
    Status   char(60)
);

comment on column Admin.Id is 'Sequenced User Id';

comment on column Admin.User_Id is 'Visible to users';

comment on column Admin.Status is 'Active, Pending, Deactivated';

create unique index admin_id_uindex on Admin (Id);

insert into admin ( user_id, password, status) values ('User_Id_0','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_1','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_2','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_3','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_4','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_5','PasswordHash','Pending');
insert into admin ( user_id, password, status) values ('User_Id_6','PasswordHash','Pending');


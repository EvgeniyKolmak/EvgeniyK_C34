-- 1) Создание произвольной таблицы
create table person (
    id uuid,
    name varchar(20),
    age int
);

-- 2) Удаление данной таблицы
DROP TABLE if exists person;

-- 3) Вставка записи
insert into person (name, age)
values ('Jack', 25);

insert into person (name, age)
values ('Brendon', 33);

insert into person (name, age)
values ('Patrick', 29);

-- 4) Обновление записи
update person
set age = 34
where name = 'Brendon';

-- 5) Получение определенной колонки записей в бд
select name from person;

-- 6) Удаление всех записей
delete from person;
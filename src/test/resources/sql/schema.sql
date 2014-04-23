create table bs_book(
    b_id serial primary key,
    b_name varchar(60) not NULl,
    b_original_price float,
    b_discount float,
    b_vip_price float,
    b_author varchar(30),
    b_translator varchar(30),
    b_page_count integer,
    b_isbn varchar(30),
    b_publisher varchar(50),
    b_publish_time Date,
    b_added_time Date,
    b_version varchar(20),
    b_category integer
);

create table bs_category(
    c_id serial primary key,
    c_parent_id integer not null,
    c_name varchar(30) not NULL
);

create table bs_book_statistics(
    c_id serial primary key,
    c_book_id integer referenceS bs_book(b_id),
    c_click integer default 0,
    c_buy integer default 0,
    c_favorite integer default 0,
    c_comment integer default 0
);
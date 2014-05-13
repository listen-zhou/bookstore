delete from "category";
delete from "book";
delete from "statistics";
delete from "user";
delete from "comment";

-- 分类目录表
DROP TABLE IF EXISTS "category";
CREATE TABLE "category" (
  "id"        INT PRIMARY KEY,
  "parent_id" BIGINT,
  "name"      VARCHAR(30),
  "level"     INT
);

-- 书籍表
DROP TABLE IF EXISTS "book";
CREATE TABLE "book" (
  "id"             INT PRIMARY KEY,
  "name"           VARCHAR(60) NOT NULL,
  "original_price" DECIMAL,
  "discount_price" DECIMAL,
  "vip_price"      DECIMAL,
  "author"         VARCHAR(30),
  "translator"     VARCHAR(30),
  "pages"          INTEGER,
  "isbn"           VARCHAR(30),
  "publisher"      VARCHAR(50),
  "publish_time"   DATE,
  "added_time"     DATE,
  "version"        VARCHAR(20),
  "category_id"    BIGINT,
  "available"      INT,
  "picSmall"       VARCHAR(120),
  "pic_normal"     VARCHAR(120),
  "pic_big"        VARCHAR(120)
);

-- 书籍统计表
DROP TABLE IF EXISTS "statistics";
CREATE TABLE "statistics" (
  "id"       INT PRIMARY KEY,
  "book_id"  BIGINT,
  "click"    INT,
  "buy"      INT,
  "favorite" INT,
  "comment"  INT,
  "avg_star" FLOAT
);

-- 用户表
DROP TABLE IF EXISTS "user";
CREATE TABLE "user" (
  "id"           INT PRIMARY KEY,
  "name"         VARCHAR(50)  NOT NULL,
  "password"     VARCHAR(100) NOT NULL,
  "locked"       INT DEFAULT 0,
  "user_type"    INT DEFAULT 0,
  "last_ip"      VARCHAR(20),
  "last_visit"   TIMESTAMP,
  "rank"         VARCHAR(30),
  "commentrank"  VARCHAR(30),
  "email"        VARCHAR(50),
  "mobile"       VARCHAR(20),
  "gender"       VARCHAR(2),
  "birthday"     DATE,
  "occupation"   VARCHAR(30),
  "preferred"    VARCHAR(60),
  "skilled"      VARCHAR(60),
  "tags"         VARCHAR(60),
  "introduction" TEXT
);

-- 书评表
DROP TABLE IF EXISTS "comment";
CREATE TABLE "comment" (
  "id"      INT PRIMARY KEY,
  "user_id" BIGINT,
  "content" TEXT,
  "star"    INT,
  "book_id" BIGINT,
  "date"    TIMESTAMP
);
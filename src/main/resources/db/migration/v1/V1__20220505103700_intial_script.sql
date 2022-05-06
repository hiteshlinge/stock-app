CREATE TABLE IF NOT EXISTS STOCK_INFO (
ID INT NOT NULL UNIQUE,
NAME VARCHAR(100) NOT NULL UNIQUE,
CURRENTPRICE NUMERIC(10,2) NOT NULL,
CREATEDATE TIMESTAMP,
LASTUPDATE TIMESTAMP
);

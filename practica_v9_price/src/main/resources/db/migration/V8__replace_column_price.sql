ALTER TABLE book DROP COLUMN price;
ALTER TABLE book ADD price FLOAT NOT NULL DEFAULT 0;
UPDATE book SET price = price_float

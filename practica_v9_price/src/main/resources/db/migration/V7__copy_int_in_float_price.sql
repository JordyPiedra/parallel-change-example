UPDATE book SET price_float = CAST(price AS FLOAT) WHERE price_float IS NULL AND price IS NOT NULL;
UPDATE book SET price_float = 0 WHERE price_float IS NULL;
ALTER TABLE book MODIFY price_float FLOAT NOT NULL DEFAULT 0;
UPDATE book SET price = price_float where price = 0;
ALTER TABLE book DROP COLUMN price_float;
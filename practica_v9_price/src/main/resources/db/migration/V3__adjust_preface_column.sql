update book set preface = description;
UPDATE book SET preface='' WHERE preface IS NULL;
ALTER TABLE book MODIFY COLUMN preface VARCHAR(5000) NOT NULL;
ALTER TABLE book MODIFY description VARCHAR(5000) DEFAULT NULL;


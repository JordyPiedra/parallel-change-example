ALTER TABLE book ADD preface varchar(5000);
update book set preface = description;
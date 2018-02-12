USE test;

DROP TABLE IF EXISTS book;

CREATE TABLE book
(
  id INT NOT NULL AUTO_INCREMENT
    PRIMARY KEY ,
  title VARCHAR(100) NULL,
  description VARCHAR(255) NULL,
  autor VARCHAR(100) NULL,
  isbn VARCHAR(20) NULL,
  print_year INT NULL,
  read_already TINYINT NULL,
  CONSTRAINT id_UNIQUE
  UNIQUE (id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('A',
   'aaa',
   'A.Aaaa',
   '12345',
   1990, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('B',
   'bbb',
   'B.Bbbb',
   '5678',
   1991, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('C',
   'ccc',
   'C.Ccccc',
   '35789',
   1992, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('D',
   'ddd',
   'D.Dddd',
   '98756',
   1993, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('E',
   'eeee',
   'E.Eeee',
   '741235',
   1994, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('F',
   'ffff',
   'F.Ffff',
   '785412',
   1995, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('G',
   'gggg',
   'G.Gggg',
   '32145685',
   1996, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('H',
   'hhhh',
   'H.Hhhh',
   '1475236',
   1997, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('J',
   'jjjj',
   'J.Jjjj',
   '6548214',
   1998, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('K',
   'kkkk',
   'K.Kkkk',
   '5468791',
   1999, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('L',
   'lllll',
   'L.Llll',
   '987651246',
   2000, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('M',
   'mmmmm',
   'M.Mmmmm',
   '54123687',
   2001, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('N',
   'nnnn',
   'N.Nnnnn',
   '23658974',
   2002, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('BB',
   'bbbbbbvvvvv',
   'B.Bbbbvvvn',
   '4578621',
   2003, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('Vvv',
   'vvvvv',
   'V.Vvvvvv',
   '45789513',
   2003, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('C',
   'cccc',
   'C.Ccccc',
   '879632',
   2004, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('X',
   'xxxx',
   'X.Xxxxxx',
   '45421213',
   2005, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('Z',
   'zzzzz',
   'Z.Zzzzzz',
   '45498989',
   2006, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('AS',
   'asasas',
   'A.Assaass',
   '88776655',
   2007, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('SD',
   'sdsdsd',
   'S.Dsdsdsd',
   '554488993',
   2008, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('DF',
   'dfdfdf',
   'D.Fffddff',
   '22335544',
   2009, FALSE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('FG',
   'fgfgfgf',
   'F.Gfgfgf',
   '5588742',
   2010, TRUE );

INSERT INTO book (title, description, autor, isbn, print_year, read_already) VALUES
  ('HJ',
   'hjhjhjh',
   'H.Jhjhjhjh',
   '66998542',
   2011, TRUE );
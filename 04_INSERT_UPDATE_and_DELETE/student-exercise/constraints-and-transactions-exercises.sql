-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor
(
        first_name
               , last_name
)
VALUES
        ('Hampton', 'Avenue')
        , ('Lisa', 'Byway');
SELECT *
FROM actor
ORDER BY first_name;

UPDATE actor
SET first_name = 'HAMPTON'
        , last_name = 'AVENUE'
WHERE actor_id = '201';

UPDATE actor
SET first_name = 'LISA'
        , last_name = 'BYWAY'
WHERE actor_id = '202';

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

SELECT *
FROM film
ORDER BY title;

INSERT INTO film
(title, description, release_year, language_id, length)
VALUES('Euclidean PI'
        , 'The epic story of Euclid as a pizza delivery boy in ancient Greece'
        , '2008'
        , '1'
        , '198');
        
UPDATE film
SET title = 'EUCLIDEAN PI'
WHERE film_id = '1001';

DELETE FROM film
WHERE title = 'Euclidean PI'
        AND film_id = '1002';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT *
FROM film_actor
WHERE film_id = 1001;
        
INSERT INTO film_actor
(
        film_id
        , actor_id
)
VALUES (1001, 201)
        , (1001, 202);


-- 4. Add Mathmagical to the category table.
SELECT *
FROM category;
INSERT INTO category
(name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

SELECT film_id
        , title
FROM film
WHERE title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

INSERT INTO film_category
(film_id, category_id)
VALUES (274, 17)
        , (494, 17)
        , (714, 17)
        , (996, 17)
        , (1001, 17);
           
INSERT INTO film_category
(film_id, category_id)
VALUES (1001, 17);
        
SELECT *
FROM film_category
WHERE category_id = 17;



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
SELECT rating
FROM film
WHERE title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

UPDATE film
SET rating = 'G'
WHERE title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT f.title
        , f.film_id
        , i.inventory_id
        , s.store_id
FROM film AS f
INNER JOIN inventory AS i
        ON f.film_id = i.film_id
INNER JOIN store AS s
        ON i.store_id = s.store_id
WHERE f.title = 'EUCLIDEAN PI';

BEGIN TRANSACTION;

INSERT INTO inventory
(film_id, store_id)
VALUES (1001, 1), (1001, 2);

COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- no because you have a foreign key constraint on the film_id.

SELECT store_id
        , film_id
FROM inventory
WHERE film_id = 1001;

BEGIN TRANSACTION;

DELETE FROM film
WHERE title = 'Euclidean PI'
        AND film_id = '1001';

ROLLBACK;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- It didn't succeed because there's foreign key constraint on category_id.

SELECT *
FROM category

BEGIN TRANSACTION;

DELETE FROM category
WHERE category_id = 17;

ROLLBACK;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- It succeeded because there were no key constraints. category_id is both a foreign and primary key, and is linked

SELECT film_id
FROM film_category
WHERE category_id = 17;

BEGIN TRANSACTION;

DELETE FROM film_category                
WHERE category_id = 17;

COMMIT;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
--  No because of foreign key constraint - actor is still linked to the film_id 

SELECT *
FROM category;

SELECT *
FROM film
WHERE title = 'EUCLIDEAN PI';

BEGIN TRANSACTION;

DELETE FROM category
WHERE category_id = 17;

COMMIT;

DELETE FROM film
WHERE film_id = '1001';

ROLLBACK;

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
        -- there are 538 table constraints that focus mostly on foreign and primary key restraints.
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
        -- there are 40 column usage constraints that describe which columns are connected/dependent on the film.     
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;
        -- there are 22 referential constraints where the film has a specific relationship with another column.
